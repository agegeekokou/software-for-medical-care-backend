package co.simplon.p25.softwareformedicalcare.dtos;

public class UserCreate {
	
	private String username;
	private String password;
	private String roleName;
	
	public UserCreate() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "UserCreate [username=" + username + ", password=" + password + "]";
	}
	
}
