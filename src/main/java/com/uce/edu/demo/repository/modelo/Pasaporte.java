package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {
	
	@Id
	@Column(name ="pasa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasa_name_gerneration")
	@SequenceGenerator(name = "pasa_name_gerneration",sequenceName = "pasa_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name ="pasa_numero")
	private int numero;
	
	@Column(name ="pasa_fecha_emision")
	private LocalDateTime fechaEmision;
	
	@Column(name ="pasa_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	
	@OneToOne//(mappedBy = "ciudadano", cascade = CascadeType.ALL)
	@JoinColumn(name ="pasa_id_ciudadano")//este es la clave foranea 
	private Ciudadano ciudadano;
	
	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad +  "]";
	}


	//set y get





	public int getNumero() {
		return numero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	
	

}
