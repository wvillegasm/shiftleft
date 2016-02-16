package org.shiftleft.web.dto;

import java.io.Serializable;

public class Client implements Serializable {

	private String username;
	private String password;

	public Client() {
		super();
	}

	public Client(String name, String password) {
		super();
		this.username = name;
		this.password = password;
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

}
