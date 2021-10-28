package repositorioalunos;

public class Aluno {
	private String nome, rg;
	private double mediaFinal;

	public Aluno(String nome, String rg, double mediaFinal) {
		this.nome = nome;
		this.rg = rg;
		this.mediaFinal = mediaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", rg=" + rg + ", mediaFinal=" + mediaFinal + "]";
	}
	
	
}
