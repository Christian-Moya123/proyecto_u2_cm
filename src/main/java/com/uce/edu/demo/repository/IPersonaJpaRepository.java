package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

public interface IPersonaJpaRepository {
	
	public Persona buscarPorId(Integer id);
	public void insertar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public Persona buscarPorCedula(String cedula);
	public Persona buscarPorCedulaType(String cedula);
	public Persona buscarPorCedulaNamed(String cedula);
	public Persona buscarPorCedulaNamedTyped(String cedula);
	public List<Persona> buscarPorApellido(String apellido);
	public List<Persona> buscarPorGenero(String genero);
	public List<Persona> buscarPorNombre(String nombre);
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido);
	
	public int actualizarPorApellido(String genero,String apellido);
	public int eliminarPorGenero(String genero);
	
	public Persona buscarPorCedulaNative(String cedula);
	public Persona buscarPorCedulaNamedNative(String cedula);
	public Persona buscarPorCedulaCriteriaApi(String cedula);

	public List<Persona> buscarPorDinamicamnteCriteriaApi(String nombre, String apellido, String genero);
	public List<Persona> buscarPorDinamicamentePredicadosCriteriaApi(String nombre, String apellido, String genero);
	
	//Objetos Sencillos
	public List<PersonaSencilla> buscarPorApellidoSencillos(String apellido);
	public List<PersonaContadorGenero> consultarCantidadPorGenero();

}
