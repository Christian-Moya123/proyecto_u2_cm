package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class PersonaContadorGenero implements Serializable{
	private String genero;
	private Long numero;
	private static final long serialVersionUID = 1L;
	
	public PersonaContadorGenero(String genero, Long numero)  {
		super();
		this.genero = genero;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "PersonaContadorGenero [genero=" + genero + ", numero=" + numero + "]";
	}
	


	//get y set
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	

}
