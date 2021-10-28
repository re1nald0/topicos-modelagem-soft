package userpermissions;

public class RegularUser extends User {

	public RegularUser() {
	}
	
	public RegularUser(RegularUser user) {
		this.categoriaPermissao = user.getCategoriaPermissao();
		this.canCreate = user.isCanCreate();
		this.canView = user.isCanView();
		this.canUpdate = user.isCanUpdate();
		this.canDelete = user.isCanDelete();
	}

	@Override
	public User clone() {
		return new RegularUser(this);
	}
}
