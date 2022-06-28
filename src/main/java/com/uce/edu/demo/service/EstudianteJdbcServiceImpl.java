package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.to.Estudiante;

@Service
public class EstudianteJdbcServiceImpl  implements IEstudianteJdbcService{
	
	@Autowired
	private IEstudianteJdbcRepository iEstudianteJdbcRepository;

	@Override
	public void guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.insertar(estudiante);
		
	}

	@Override
	public void actualizarEstudiante(Estudiante estudinte) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.actualizar(estudinte);
	}

	@Override
	public void eliminaraEstudiante(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.eliminar(id);
	}

	@Override
	public Estudiante buscarEstudiante(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJdbcRepository.buscarPorId(id);
	}

}
