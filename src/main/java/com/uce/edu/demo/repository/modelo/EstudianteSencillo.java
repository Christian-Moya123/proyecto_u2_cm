package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{
	private String nombre;
	private String apellido;
	private Integer edad;
	private static final long serialVersionUID = 1L;
	
	public EstudianteSencillo(String nombre, String apellido, Integer edad) {
		this.apellido=apellido;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "EstudianteSencillo [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
