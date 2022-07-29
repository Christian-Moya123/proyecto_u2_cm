package com.uce.edu.demo.coreccion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.Pasaporte;


@Entity
@Table(name="matricula")
public class Matricula {
	
	@Id
	@Column(name="matri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_gernerationM")
	@SequenceGenerator(name = "name_gernerationM",sequenceName = "matri_id_seq", allocationSize = 5)//este si tienen que tener el nombre de mi secuencia en SQL
	private Integer idM;
	
	@Column(name="matri_valor_matricula")
	private BigDecimal valorMatricula;
	
	@Column(name="matri_fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@ManyToOne
	@JoinColumn(name = "matri_id_propietario")
	private Propietario propietario;
	
	@OneToOne
	@JoinColumn(name ="matri_id_vehiculo")
	private Vehiculo vehiculo;

	
	//get y set

	public Integer getIdM() {
		return idM;
	}

	public void setIdM(Integer idM) {
		this.idM = idM;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	

	
	
	
	

}
