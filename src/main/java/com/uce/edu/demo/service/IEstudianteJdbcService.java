package com.uce.edu.demo.service;

import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

public interface IEstudianteJdbcService {

	public void guardarEstudiante(EstudianteTo estudiante);
	public void actualizarEstudiante(EstudianteTo estudinte);
	public void eliminaraEstudiante(int id);
	public EstudianteTo buscarEstudiante(int id);
}
