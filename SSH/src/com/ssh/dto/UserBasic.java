package com.ssh.dto;

/**
 * UserBasic entity. @author MyEclipse Persistence Tools
 */

public class UserBasic implements java.io.Serializable {

	// Fields

	private Integer id;
	private String account;
	private String password;
	private String role;

	// Constructors

	/** default constructor */
	public UserBasic() {
	}

	/** full constructor */
	public UserBasic(String account, String password, String role) {
		this.account = account;
		this.password = password;
		this.role = role;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}