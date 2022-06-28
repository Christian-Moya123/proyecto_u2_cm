package com.uce.edu.demo.service;

import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.Persona;

public interface IEstudianteJdbcService {

	public void guardarEstudiante(Estudiante estudiante);
	public void actualizarEstudiante(Estudiante estudinte);
	public void eliminaraEstudiante(int id);
	public Estudiante buscarEstudiante(int id);
}
