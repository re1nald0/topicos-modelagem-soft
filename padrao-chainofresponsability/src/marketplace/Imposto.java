package marketplace;

public class Imposto extends Marketplace {
    Compra compra;
    private double porcentagemTributo, valorTributado;

    public Imposto(Compra compra, double porcentagemTributo) {
        this.compra = compra;
        this.porcentagemTributo = porcentagemTributo;
    }

    public void tributar() {
        this.valorTributado = this.compra.getValor() * porcentagemTributo;
        System.out.println("Tributado o valor de R$" + this.valorTributado + " como imposto.");
        this.checarProximo();
    }
}
