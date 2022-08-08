package com.springquick.user;

// VO(Value Object)
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
	
	public String getId() { return this.id; }
	public void setId(String _id) { this.id = _id; }
	
	public String getPassword() { return this.password; }
	public void setPassword(String _password) { this.password = _password; }
	
	public String getName() { return this.name; }
	public void setName(String _name) { this.name = _name; }
	
	public String getRole() { return this.role; }
	public void setRole(String _role) { this.role = _role; }
	
	public String toString() {
		return "UserVO [id=" + this.id + ", password=" + this.password + ", name=" + this.name +
				", role=" + this.role + "]";
	}
}
