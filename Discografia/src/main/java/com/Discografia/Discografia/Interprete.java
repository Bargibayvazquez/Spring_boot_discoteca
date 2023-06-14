package com.Discografia.Discografia;

import java.util.List;

import jakarta.persistence.*;

@Entity(name="Interprete")
public class Interprete {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idInterprete")	
 private Long idInterprete;
@Column(name="nombre") 
 private String nombre;
@Column(name="tipoInterprete") 
 private String tipoInterprete;
@Column(name="Nacionalidad")
 private String  Nacionalidad;
@OneToMany(cascade=CascadeType.ALL)
List<Disco>discoList;

//Setters & getters 


public Long getIdInterprete() {
	return idInterprete;
}
public void setIdInterprete(Long idInterprete) {
	this.idInterprete = idInterprete;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipoInterprete() {
	return tipoInterprete;
}
public void setTipoInterprete(String tipoInterprete) {
	this.tipoInterprete = tipoInterprete;
}
public String getNacionalidad() {
	return Nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}

//toString 

@Override
public String toString() {
	return "Interprete [idInterprete=" + idInterprete + ", nombre=" + nombre + ", tipoInterprete=" + tipoInterprete
			+ ", Nacionalidad=" + Nacionalidad + "]";
}


//Constructor

public Interprete(Long idInterprete, String nombre, String tipoInterprete, String nacionalidad) {
	super();
	this.idInterprete = idInterprete;
	this.nombre = nombre;
	this.tipoInterprete = tipoInterprete;
	Nacionalidad = nacionalidad;
}
public Interprete() {
	super();
}

	







}
