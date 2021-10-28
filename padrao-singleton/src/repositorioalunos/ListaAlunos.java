package repositorioalunos;

import java.util.ArrayList;


public class ListaAlunos {

	private Aluno aluno;
	private static ListaAlunos listaAlunos;
	
	private ArrayList<Aluno> alunos;
	
	private ListaAlunos() {
		this.alunos = new ArrayList<>(); 
	}
	
	public static ListaAlunos getInstance() {
		if(listaAlunos == null) {
			listaAlunos = new ListaAlunos();
		}
		
		return listaAlunos;
	}
	
	public void adicionarAluno(String nome, String rg, double mediaFinal) {
		this.aluno = new Aluno(nome, rg, mediaFinal);
		// System.out.println(this.aluno);
		this.alunos.add(this.aluno);
		return;
	}
	
	public int removerAluno(String rg) {
		int index = -1;
		for(int i = 0; i < this.alunos.size(); i++) {
			if(this.alunos.get(i).getRg().equals(rg)) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			this.alunos.remove(index);
			return index;
		} else {
			return -1;
		}
	}
	
	public Aluno buscarAluno(String rg) {
		int index = -1;
		for(int i = 0; i < this.alunos.size(); i++) {
			if(this.alunos.get(i).getRg().equals(rg)) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			return this.alunos.get(index);
		} else {
			return null;
		}
	}
	
	public ArrayList<Aluno> obterListaAlunos() {
		return this.alunos;
	}
	
}
