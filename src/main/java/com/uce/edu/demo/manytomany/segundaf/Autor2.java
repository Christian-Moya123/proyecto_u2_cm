package com.uce.edu.demo.manytomany.segundaf;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.manytomany.Libro;
//////////////////////////////////////////////////////////SEGUNDA FORMA
@Entity
@Table(name="autor_dos")
public class Autor2 {
	
	@Id
	@Column(name="auto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto2_name_gerneration")
	@SequenceGenerator(name = "auto2_name_gerneration",sequenceName = "auto2_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "auto_nombre")
	private String nombre;

	@OneToMany(mappedBy = "autor2")
	private List<AutorLibro2> autorLibros;
	
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

	public List<AutorLibro2> getAutorLibros() {
		return autorLibros;
	}

	public void setAutorLibros(List<AutorLibro2> autorLibros) {
		this.autorLibros = autorLibros;
	}



	
}
