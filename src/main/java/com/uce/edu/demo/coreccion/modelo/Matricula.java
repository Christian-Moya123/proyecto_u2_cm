package com.uce.edu.demo.coreccion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
@Entity
@Table(name="matricula")*/
public class Matricula {
	
	@Id
	@Column(name="matri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_gernerationM")
	@SequenceGenerator(name = "name_gernerationM",sequenceName = "matri_id_seq", allocationSize = 5)//este si tienen que tener el nombre de mi secuencia en SQL
	private Integer idM;
	
	@JoinColumn(name="matri_propietario")
	private Propietario propietario;
	
	@Column(name="matri_valorMatricula")
	private BigDecimal valorMatricula;
	
	@JoinColumn(name="matri_vehiculo")
	private Vehiculo vehiculo;
	
	@Column(name="matri_fechaMatricula")
	private LocalDateTime fechaMatricula;
	
	@Override
	public String toString() {
		return "Matricula [idM=" + idM + ", propietario=" + propietario + ", valorMatricula=" + valorMatricula
				+ ", vehiculo=" + vehiculo + ", fechaMatricula=" + fechaMatricula + "]";
	}
	
	//get y set
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Integer getIdM() {
		return idM;
	}
	public void setIdM(Integer idM) {
		this.idM = idM;
	}
	
	

}
