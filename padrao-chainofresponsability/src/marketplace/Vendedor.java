package marketplace;

public class Vendedor extends Marketplace {
    Compra compra;
    private double porcentagemTributo, valorTributado;

    public Vendedor(Compra compra, double porcentagemTributo) {
        this.compra = compra;
        this.porcentagemTributo = porcentagemTributo;
    }

    public void tributar() {
        this.valorTributado = this.compra.getValor() * porcentagemTributo;
        System.out.println("Recebido o valor de R$" + this.valorTributado + " para o vendedor.");
        this.checarProximo();
    }
}
