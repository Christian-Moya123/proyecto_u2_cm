package com.uce.edu.demo.manytomany.segundaf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.onetomany.Hotel;

@Entity
@Table(name = "autor_libro2")
public class AutorLibro2 {
	
	@Id
	@Column(name="auli_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auli_name_gerneration")
	@SequenceGenerator(name = "auli_name_gerneration",sequenceName = "auli_id_seq", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "auli_id_autor2")//clave foranea
	private Autor2 autor2;
	
	@ManyToOne
	@JoinColumn(name = "auli_id_libro2")//clave foranea
	private Libro2 libro2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Autor2 getAutor2() {
		return autor2;
	}

	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}

	public Libro2 getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}

	
	
}
