package com.Discografia.Discografia;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="Disco")
public class Disco {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idDisco")
    private Long idDisco;
@Column(name="nombre")
     private String nombre;
@Column(name="duracionMinutos")
	private int duracionMinutos;
@ManyToOne (cascade= CascadeType.ALL)
@JoinColumn(name="id_discografia")
	private Discografia discografia;


@Override
public String toString() {
	return "Disco [idDisco=" + idDisco + ", nombre=" + nombre + ", duracionMinutos=" + duracionMinutos +  ", discografia=" + discografia + "]";
}


public Long getIdDisco() {
	return idDisco;
}


public void setIdDisco(Long idDisco) {
	this.idDisco = idDisco;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getDuracionMinutos() {
	return duracionMinutos;
}


public void setDuracionMinutos(int duracionMinutos) {
	this.duracionMinutos = duracionMinutos;
}


public Discografia getDiscografia() {
	return discografia;
}


public void setDiscografia(Discografia discografia) {
	this.discografia = discografia;
}


public Disco(Long idDisco, String nombre, int duracionMinutos,  Discografia discografia) {
	super();
	this.idDisco = idDisco;
	this.nombre = nombre;
	this.duracionMinutos = duracionMinutos;
	this.discografia = discografia;
}


public Disco() {
	super();
}




	
}
