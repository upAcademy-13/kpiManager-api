package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = Person.GET_ALL_PERSON_QUERY_NAME, query="SELECT c FROM Person c"),
@NamedQuery(name = Person.GET_ALL_PERSON_IDS, query="SELECT c.id FROM Person c"),
@NamedQuery(name = Person.GET_PERSON_BY_USERNAME, query="SELECT c FROM Person c WHERE c.username =:username"),
@NamedQuery(name = Person.GET_MANAGERS_BY_UNIT, query="SELECT c FROM Person c WHERE c.unit.id =:unit AND c.role = 'manager' "),
@NamedQuery(name = Person.GET_MANAGERS, query="SELECT c FROM Person c WHERE c.role = 'manager' "),
@NamedQuery(name = Person.GET_DIRECTORS, query="SELECT c FROM Person c WHERE c.role = 'director' ")
})

public class Person extends Entity_

{

	private static final long serialVersionUID = 1L;

	public static final String GET_MANAGERS = "Person.getManagers";
	public static final String GET_DIRECTORS = "Person.getDirectors";
	public static final String GET_MANAGERS_BY_UNIT = "Person.getManagersByUnit";
	public static final String GET_PERSON_BY_USERNAME = "Person.getPersonByUsername";
	public static final String GET_ALL_PERSON_QUERY_NAME = "Person.getAllPersons" ;
	public static final String GET_ALL_PERSON_IDS = "Person.getAllPersonsIds";


	private String username;
	private String hashcode;
	private String salt;
	private String name;
	private String email;
	private String role;
	
	@ManyToOne
	private Unit unit;
	
	// Role will define the permissions

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
//
//	public Unit getUnit() {
//		return unit;
//	}
//
//	public void setUnit(Unit unit) {
//		this.unit = unit;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashcode() {
		return hashcode;
	}

	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
//	@Override
//	public String toString() {
//		return "Person [username=" + username + ", hashcode=" + hashcode + ", salt=" + salt + ", name=" + name
//				+ ", email=" + email + ", unit=" + unit + ", role=" + role + "]";
//	}

}







