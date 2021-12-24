package marketplace;

public class MercadoLivre extends Marketplace {
    Compra compra;
    private double porcentagemTributo, valorTributado;

    public MercadoLivre(Compra compra, double porcentagemTributo) {
        this.compra = compra;
        this.porcentagemTributo = porcentagemTributo;
    }

    public void tributar() {
        this.valorTributado = this.compra.getValor() * porcentagemTributo;
        System.out.println("Tributado o valor de R$" + this.valorTributado + " para o Mercado Livre.");
        this.checarProximo();
    }
}
