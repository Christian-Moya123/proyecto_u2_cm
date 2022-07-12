package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void guardarEstudiante(Estudiante estudiante);
	public void actualizarEstudiante(Estudiante estudinte);
	public void eliminaraEstudiante(int id);
	public Estudiante buscarEstudiante(int id);
	
	public Estudiante buscarPorCedulaType(String cedula);
	public List<Estudiante> buscarPorNombreApellidoType(String nombre, String apellido);
	
	public List<Estudiante> buscarPorEdadNamed(Integer edad);
	public List<Estudiante> buscarPorNombreConANamed(String nombre);
	
	public Estudiante buscarPorCedulaNamedTyped(String cedula);
	public List<Estudiante> buscarPorNombreApellidoNamedType(String nombre, String apellido);
}
