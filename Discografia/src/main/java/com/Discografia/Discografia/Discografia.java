package com.Discografia.Discografia;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Discografia")
public class Discografia  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 7390717640674854981L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_discografia")
	private Long id_discografia;
@Column(name="nombreDiscografia")
	private String nombreDiscografia;
@Column(name="sedePais")
	private String sedePais;




//Getters & setters


public Long getId_discografia() {
	return id_discografia;
}
public void setId_discografia(Long id_discografia) {
	this.id_discografia = id_discografia;
}
public String getNombreDiscografia() {
	return nombreDiscografia;
}
public void setNombreDiscografia(String nombreDiscografia) {
	this.nombreDiscografia = nombreDiscografia;
}
public String getSedePais() {
	return sedePais;
}
public void setSedePais(String sedePais) {
	this.sedePais = sedePais;
}


//ToString
@Override
public String toString() {
	return "Discografia [id_discografia=" + id_discografia + ", nombreDiscografia=" + nombreDiscografia + ", sedePais="
			+ sedePais + "]";
}

//constructores
public Discografia(Long id_discografia, String nombreDiscografia, String sedePais) {
	super();
	this.id_discografia = id_discografia;
	this.nombreDiscografia = nombreDiscografia;
	this.sedePais = sedePais;
}
public Discografia() {
	super();
}


	
	
	
	
	
	
}
