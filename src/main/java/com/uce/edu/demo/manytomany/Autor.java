package com.uce.edu.demo.manytomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	
	@Id
	@Column(name="auto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_name_gerneration")
	@SequenceGenerator(name = "auto_name_gerneration",sequenceName = "auto_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "auto_nombre")
	private String nombre;
	
	@ManyToMany(mappedBy = "autores")
	private Set<Libro> libros;
	
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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	
}
