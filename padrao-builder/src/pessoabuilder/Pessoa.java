package pessoabuilder;

public class Pessoa {
	private String nome, dataNascimento, sexo, logradouro, bairro, cidade, uf;
	private int rg, cpf, tituloEleitor, numeroResidencia, cep;

	private Pessoa(String nome,
				   String dataNascimento,
				   String sexo,
				   String logradouro,
				   String bairro,
				   String cidade,
				   String uf,
				   int rg,
				   int cpf,
				   int tituloEleitor,
				   int numeroResidencia,
				   int cep
	) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.rg = rg;
		this.cpf = cpf;
		this.tituloEleitor = tituloEleitor;
		this.numeroResidencia = numeroResidencia;
		this.cep = cep;
	}
	
	public static class PessoaBuilder {
		private String nome, dataNascimento, sexo, logradouro, bairro, cidade, uf;
		private int rg, cpf, tituloEleitor, numeroResidencia, cep;

		public PessoaBuilder(String nome, String dataNascimento, String sexo, int rg) {
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.sexo = sexo;
			this.rg = rg;
		}

		public Pessoa buildPessoa() {
			return new Pessoa(this.nome,
							  this.dataNascimento,
							  this.sexo,
							  this.logradouro,
							  this.bairro,
							  this.cidade,
							  this.uf,
							  this.rg,
							  this.cpf,
							  this.tituloEleitor,
							  this.numeroResidencia,
							  this.cep);
		}

		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PessoaBuilder dataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}

		public PessoaBuilder sexo(String sexo) {
			this.sexo = sexo;
			return this;
		}

		public PessoaBuilder logradouro(String logradouro) {
			this.logradouro = logradouro;
			return this;
		}

		public PessoaBuilder bairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public PessoaBuilder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public PessoaBuilder uf(String uf) {
			this.uf = uf;
			return this;
		}

		public PessoaBuilder rg(int rg) {
			this.rg = rg;
			return this;
		}

		public PessoaBuilder cpf(int cpf) {
			this.cpf = cpf;
			return this;
		}

		public PessoaBuilder tituloEleitor(int tituloEleitor) {
			this.tituloEleitor = tituloEleitor;
			return this;
		}

		public PessoaBuilder numeroResidencia(int numeroResidencia) {
			this.numeroResidencia = numeroResidencia;
			return this;
		}

		public PessoaBuilder cep(int cep) {
			this.cep = cep;
			return this;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getTituloEleitor() {
		return tituloEleitor;
	}
	
	public void setTituloEleitor(int tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	public int getNumeroResidencia() {
		return numeroResidencia;
	}
	
	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", logradouro="
				+ logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", rg=" + rg + ", cpf="
				+ cpf + ", tituloEleitor=" + tituloEleitor + ", numeroResidencia=" + numeroResidencia + ", cep=" + cep
				+ "]";
	}
}
