package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

import javax.persistence.Table;


public class PersonaSencilla  implements Serializable{
	private String nombre;
	private String apellido;
	private static final long serialVersionUID = 1L;
	
	//private static final 
	public PersonaSencilla () {
		
	}
	
	public PersonaSencilla (String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;
		
	}
	
	
	@Override
	public String toString() {
		return "PersonaSencilla [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	//set y get 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
