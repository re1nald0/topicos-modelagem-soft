package main;

import javax.swing.JOptionPane;

public class PessoaTeste {
	public static void main(String args[]) {
		PessoaFisica pf1 = new PessoaFisica("Rei", "22/08", "1111111111", 10000.0);
		PessoaJuridica pj1 = new PessoaJuridica("Rei", "22/08", "1111111111", 10000.0);
		
		System.out.println(pf1);
		System.out.println(pj1);
	}
}
