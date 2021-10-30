package com.dan.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table( name = "dojos" )
public class Dojo {

@Id
//@NotNull
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Size(max = 100 )
private String dojo;


@OneToMany( mappedBy = "dojo", fetch = FetchType.LAZY )
private List<Ninja> ninjas;

public Dojo() {}

public Dojo(String dojo ) {
	this.dojo = dojo;
}

public Dojo( Long id, String dojo ) {
	this.id = id;
	this.dojo = dojo;
}

//-------------------------------------Getter y Setters------------------------

public Long getDojo_id() {
	return id;
}

public void setDojo_id(Long dojo_id) {
	this.id = dojo_id;
}

public String getDojo() {
	return dojo;
}

public void setDojo(String dojo) {
	this.dojo = dojo;
}

public List<Ninja> getNinjas() {
	return ninjas;
}

public void setNinjas(List<Ninja> ninjas) {
	this.ninjas = ninjas;
}
	
}
