package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void guardarEstudiante(Estudiante estudiante);
	public void actualizarEstudiante(Estudiante estudinte);
	public void eliminaraEstudiante(int id);
	public Estudiante buscarEstudiante(int id);
}
