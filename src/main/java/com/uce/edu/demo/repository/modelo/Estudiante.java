package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
@NamedQuery(name="Estudiante.buscarPorCedula" , query="SELECT e FROM Estudiante e where e.cedula = :datoCedula")
@NamedQuery(name="Estudiante.buscarPorNombreApellido",query="SELECT e FROM Estudiante e where e.nombre = :datoNombre AND e.apellido = :datoApellido ")
@NamedQuery(name="Estudiante.buscarPorEdad",query="SELECT e FROM Estudiante e where e.edad = :datoEdad  ")
@NamedQuery(name="Estudiante.buscarPorNombreConA",query="SELECT e FROM Estudiante e where e.nombre = :datoNombre ")

//Native Query
@NamedNativeQuery(name ="Estudiante.buscarPorNombreApellidoNative" , query= "SELECT * FROM estudiante WHERE nombre = :datoNombre AND apellido = :datoApellido  ", resultClass = Estudiante.class)
@NamedNativeQuery(name ="Estudiante.buscarPorIdNative", query= "SELECT * FROM estudiante WHERE id = :datoId", resultClass = Estudiante.class)
public class Estudiante {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "cedula")
	private String cedula;
	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cedula="
				+ cedula + "]";
	}

	//get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	

}
