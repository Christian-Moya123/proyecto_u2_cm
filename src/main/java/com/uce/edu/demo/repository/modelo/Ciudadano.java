package com.uce.edu.demo.repository.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	
	@Id
	@Column(name="ciu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciu_name_gerneration")
	@SequenceGenerator(name = "ciu_name_gerneration",sequenceName = "ciu_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="ciu_nombre")
	private String nombre;
	
	@Column(name="ciu_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)//debe tener el mismo nombre que el ciudadano de la tabla hija, el cascade hace que se inserte el hijo de  una ves 
	private Empleado empleado;
	
	
	


	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	//set y get
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	

}
