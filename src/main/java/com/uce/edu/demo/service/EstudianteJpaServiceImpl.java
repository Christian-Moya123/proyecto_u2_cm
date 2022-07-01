package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.to.EstudianteTo;

@Service
public class EstudianteJpaServiceImpl  implements IEstudianteJpaService{
	
	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;

	@Override
	public void guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.insertar(estudiante);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiente) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(estudiente);
	}

	@Override
	public void eliminaraEstudiante(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(id);
	}

	@Override
	public Estudiante buscarEstudiante(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorId(id);
	}

}
