package com.uce.edu.demo.service;

import java.util.List;

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

	@Override
	public Estudiante buscarPorCedulaType(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCedulaType(cedula);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamedType(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorEdadNamed(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorEdadNamed(edad);
	}

	@Override
	public List<Estudiante> buscarPorNombreConANamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreConANamed(nombre);
	}

	@Override
	public Estudiante buscarPorCedulaNamedTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCedulaNamedTyped(cedula);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamedType(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCedulaNative(cedula);
	}

	@Override
	public List<Estudiante> buscarPorEdadNative(Integer edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorEdadNative(edad);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamedNative(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorIddNative(Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorIddNative(id);
	}

}
