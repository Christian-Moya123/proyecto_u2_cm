package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;

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
	
	@Column(name="ciu_cedula")
	private String cedula;
	
	@Column(name="ciu_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)//debe tener el mismo nombre que el ciudadano de la tabla hija, el cascade hace que se inserte el hijo de  una ves 
	private Empleado empleado;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
	private Pasaporte pasaporte;
	
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento +  ", pasaporte=" + pasaporte + "]";
	}
	
	//set y get

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	
	


	
	
	

}
