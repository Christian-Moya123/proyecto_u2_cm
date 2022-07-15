package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;



public interface IEstudianteJpaRepository {
	public Estudiante buscarPorId(int id);
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);
	
	public Estudiante buscarPorCedulaType(String cedula);
	public List<Estudiante> buscarPorNombreApellidoType(String nombre, String apellido);
	
	public List<Estudiante> buscarPorEdadNamed(Integer edad);
	public List<Estudiante> buscarPorNombreConANamed(String nombre);
	
	public Estudiante buscarPorCedulaNamedTyped(String cedula);
	public List<Estudiante> buscarPorNombreApellidoNamedType(String nombre, String apellido);
	
	//NATIVE QUERY
	public Estudiante buscarPorCedulaNative(String cedula);
	public List<Estudiante> buscarPorEdadNative(Integer edad);
		//NAMED NATIVE QUERY
	public List<Estudiante>  buscarPorNombreApellidoNamedNative(String nombre, String apellido);
	public Estudiante buscarPorIddNative(Integer id);
	
}
