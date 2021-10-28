package main;

public class Pessoa {
	public String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome agora sim" + this.nome;
	}
	
	//@Override
	//public abstract String toString();
}
