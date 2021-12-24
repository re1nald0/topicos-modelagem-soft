package marketplace;

public class Cliente {
	public static void main(String[] args) {
		Compra compra = new Compra(100.00);

		Marketplace imposto = new Imposto(compra, 0.05);
		Marketplace mercadoLivre = new MercadoLivre(compra, 0.10);
		Marketplace vendedor = new Vendedor(compra, 0.85);

		//Seta a cadeia de sucessao
		imposto.setProximo(mercadoLivre);
		mercadoLivre.setProximo(vendedor);

		// Inicia a sequencia de acoes para tributacao
		imposto.tributar();
	}
}
