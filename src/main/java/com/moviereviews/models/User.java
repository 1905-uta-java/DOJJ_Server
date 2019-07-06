package com.moviereviews.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User implements Serializable {

	// Serial Id
	private static final long serialVersionUID = 6321359600761077650L;
	
	// Attributes for the User Object
	@Id
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@Column(name="USER_NAME", nullable=false)
	private String username;
	@Column(name="PASS_WORD", nullable=false)
	private String password;
	@Column(name="REPUTATION")
	private int reputation;
	@Column(name="PRIVILEGE", nullable=false)
	private String privilege;
	
	// Constructors
	public User() {
		super();
	}

	public User(String email, String username, String password, int reputation, String privilege) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.reputation = reputation;
		this.privilege = privilege;
	}
	
	public User(String email) {
		super();
		this.email = email;
	}

	// Getters and Setters for Attributes
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	// Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((privilege == null) ? 0 : privilege.hashCode());
		result = prime * result + reputation;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	// Equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (privilege != other.privilege)
			return false;
		if (reputation != other.reputation)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	// To String Method
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + ", reputation="
				+ reputation + ", privilege=" + privilege + "]";
	}
	
	
}
