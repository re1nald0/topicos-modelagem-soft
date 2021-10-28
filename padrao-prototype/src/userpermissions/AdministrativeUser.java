package userpermissions;

public class AdministrativeUser extends User {

    public AdministrativeUser() {
	}
	
	public AdministrativeUser(AdministrativeUser user) {
		this.categoriaPermissao = user.getCategoriaPermissao();
		this.canCreate = user.isCanCreate();
		this.canView = user.isCanView();
		this.canUpdate = user.isCanUpdate();
		this.canDelete = user.isCanDelete();
	}

	@Override
	public User clone() {
		return new AdministrativeUser(this);
	}
}
