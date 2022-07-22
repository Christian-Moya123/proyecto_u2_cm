package com.uce.edu.demo.service;


import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Persona;

public interface ICiudadanoJpaService {
	public void insertarCiudadano(Ciudadano ciudadano);
	
	public Ciudadano buscarPorId(Integer id);
	public void actualizarPorId(Ciudadano ciudadano);
	public void eliminarPorId(Integer id);

}
