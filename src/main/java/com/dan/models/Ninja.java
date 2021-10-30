package com.dan.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table( name = "ninjas" )
public class Ninja {

	@Id
//	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ninjaid;

	@NotNull
	@Size( max = 100 )
	private String firstname;
	
	@NotNull
	@Size( max = 100 )
	private String lastname;
	
	@NotNull
	private Long age;


	@ManyToOne( fetch = FetchType.LAZY )
	@JoinColumn( name = "id" )
	private Dojo dojo;


	public Ninja() {}


	public Ninja( String firstname, String lastname,Long age, Dojo dojo ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.dojo = dojo;
	}
	
	public Ninja( Long id, String firstname, String lastname,Long age, Dojo dojo ) {
		this.ninjaid = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.dojo = dojo;
	}
//----------------------------Getters y Setters-----------------------------------------


	public Long getNinja_id() {
		return ninjaid;
	}

	public void setNinja_id(Long ninja_id) {
		this.ninjaid = ninja_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}

}
