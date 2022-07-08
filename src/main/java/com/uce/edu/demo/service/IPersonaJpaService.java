package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaService {
	
	public Persona buscarPorId(Integer id);
	public void insertar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public Persona buscarCedula(String cedula);
	public List<Persona> buscarApellido(String apellido);
	public List<Persona> buscarGenero(String genero);
	public List<Persona> buscarNombre(String nombre);

}
