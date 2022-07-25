package com.uce.edu.demo.repository.modelo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@Column(name="pedi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedi_name_gerneration")
	@SequenceGenerator(name = "pedi_name_gerneration",sequenceName = "pedi_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="pedi_nombre_p")
	private String nombreP;
	
	@Column(name="pedi_tipo")
	private String tipo;
	
	@Column(name="pedi_peso")
	private Integer peso;

	@ManyToOne
	@JoinColumn(name = "pedi_id_cliente")//clave foranea
	private Cliente cliente;//relacion muchos a uno, habitacion hacia el hotel
	
	
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nombreP=" + nombreP + ", tipo=" + tipo + ", peso=" + peso + ", cliente="
				+ cliente + "]";
	}

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
