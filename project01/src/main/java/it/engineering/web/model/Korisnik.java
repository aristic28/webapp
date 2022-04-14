package it.engineering.web.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the korisnik database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnik.findAll", query="SELECT k FROM Korisnik k")
public class Korisnik implements Serializable {
	private static final long serialVersionUID = 1L;

	

	private String firstname;

	private String lastname;

	private String password;

	@Id
	private String username;

	public Korisnik() {
	}
	
	public Korisnik( String firstname, String lastname, String password, String username) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.username = username;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Korisnik [firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", username="
				+ username + "]";
	}
	
	

}