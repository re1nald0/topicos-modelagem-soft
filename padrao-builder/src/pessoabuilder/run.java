package pessoabuilder;

public class run {
	public static void main(String[] args) {
		System.out.println("Construindo pessoa");

		Pessoa pessoa1 = new Pessoa.PessoaBuilder("Jao", "10/10/1950", "M", 12345)
								   .logradouro("Rua aquela la")
								   .bairro("Centro")
								   .cidade("PG")
								   .uf("PR")
								   .numeroResidencia(1000)
								   .cep(11111111)
								   .buildPessoa();

		System.out.println("---PESSOA 1---");
		System.out.println(pessoa1.toString());

		Pessoa pessoa2 = new Pessoa.PessoaBuilder("Maria", "10/10/2000", "F", 67890).buildPessoa();

		System.out.println("---PESSOA 2---");
		System.out.println(pessoa2.toString());
	}
}
