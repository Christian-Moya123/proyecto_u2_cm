package com.uce.edu.demo.manytomany;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {

	@Id
	@Column(name="libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_name_gerneration")
	@SequenceGenerator(name = "libr_name_gerneration",sequenceName = "libr_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="libr_titulo")
	private String titulo;
	
	@Column(name="libr_cantidad_pagina")
	private Integer cantidadPaginas;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="libro_autor", joinColumns = @JoinColumn(name="liau_id_libro"), inverseJoinColumns =@JoinColumn(name="liau_id_autor") )//este  especifica la tabla de rompimiento y se lo pone en  el principal, pero de muchos a muchos no importa a cual le pones principal
	//joinColums fK de la tabla principal, inverseJoinColumns fk de la tabal secundaria
	private Set<Autor> autores;

	
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

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}


	
}
