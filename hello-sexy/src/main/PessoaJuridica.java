package main;

public class PessoaJuridica extends Pessoa {
	public String anoInicio, cnpj;
	public Double faturamento;
	
	public PessoaJuridica(String nome, String anoInicio, String cnpj, Double faturamento) {
		super(nome);
		this.anoInicio = anoInicio;
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}
	
	//@Override
	//public String toString() {
	//	super.toString();
		//return "Nome" + this.nome;
	//}
}