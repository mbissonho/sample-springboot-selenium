package com.company.webapp.model;

public class LoginDTO {

	private String login;
	private String pass;
	
	public LoginDTO(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	
	public LoginDTO() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
