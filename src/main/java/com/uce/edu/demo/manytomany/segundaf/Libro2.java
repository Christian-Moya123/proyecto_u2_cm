package com.uce.edu.demo.manytomany.segundaf;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.manytomany.Autor;
//////////////////////////////////////////////////////////SEGUNDAFORMA
@Entity
@Table(name="libro_dos")
public class Libro2 {

	@Id
	@Column(name="libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr2_name_gerneration")
	@SequenceGenerator(name = "libr2_name_gerneration",sequenceName = "libr2_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="libr_titulo")
	private String titulo;
	
	@Column(name="libr_cantidad_pagina")
	private Integer cantidadPaginas;
	
	
	@OneToMany(mappedBy = "libro2")
	private List<AutorLibro2> autorLibros;

	
	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<AutorLibro2> getAutorLibros() {
		return autorLibros;
	}

	public void setAutorLibros(List<AutorLibro2> autorLibros) {
		this.autorLibros = autorLibros;
	}



	
}
