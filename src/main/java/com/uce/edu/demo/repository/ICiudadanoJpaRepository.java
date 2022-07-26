package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

public interface ICiudadanoJpaRepository {
	
	public void insertar(Ciudadano ciudadano);

	public Ciudadano buscarPorId(Integer id);
	public void actualizarPorId(Ciudadano ciudadano);
	public void eliminarPorId(Integer id);

}
