package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteContadorSencilla implements Serializable {
	private String genero;
	private Long numero;
	;
	private static final long serialVersionUID = 1L;
	
	public EstudianteContadorSencilla(String genero, Long numero){
		super();
		this.numero= numero;
		
		this.genero=genero;
		
	}
	
	

	@Override
	public String toString() {
		return "EstudianteContadorSencilla [genero=" + genero + ", numero=" + numero + ", nombre=" +  "]";
	}



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
