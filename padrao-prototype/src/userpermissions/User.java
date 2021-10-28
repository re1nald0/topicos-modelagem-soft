package userpermissions;

public abstract class User {
	
	String nome, cargo, identificador, categoriaPermissao;
	boolean canCreate, canView, canUpdate, canDelete;
	
	public abstract User clone();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCategoriaPermissao() {
		return categoriaPermissao;
	}

	public void setCategoriaPermissao(String categoriaPermissao) {
		this.categoriaPermissao = categoriaPermissao;
	}

	public boolean isCanCreate() {
		return canCreate;
	}

	public void setCanCreate(boolean canCreate) {
		this.canCreate = canCreate;
	}

	public boolean isCanView() {
		return canView;
	}

	public void setCanView(boolean canView) {
		this.canView = canView;
	}

	public boolean isCanUpdate() {
		return canUpdate;
	}

	public void setCanUpdate(boolean canUpdate) {
		this.canUpdate = canUpdate;
	}

	public boolean isCanDelete() {
		return canDelete;
	}

	public void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}
	
	@Override
	public String toString() {
		return "User [nome=" + nome + ", cargo=" + cargo + ", identificador=" + identificador + ", categoriaPermissao="
				+ categoriaPermissao + ", canCreate=" + canCreate + ", canView=" + canView + ", canUpdate=" + canUpdate
				+ ", canDelete=" + canDelete + "]";
	}
}
