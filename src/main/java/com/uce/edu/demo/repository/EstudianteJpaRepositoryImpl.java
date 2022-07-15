package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public Estudiante buscarPorCedulaType(String cedula) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e where e.cedula = :datoCedula", Estudiante.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e where e.nombre = :datoNombre AND e.apellido = :datoApellido", Estudiante.class);
		myTypedQuery.setParameter("datoNombre ", nombre);
		myTypedQuery.setParameter("datoApellido ", apellido);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdadNamed(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorEdad");
		myQuery.setParameter("datoEdad", edad);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreConANamed(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreConA");
		myQuery.setParameter("datoNombre", nombre);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorCedulaNamedTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCedula", Estudiante.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getResultList();
	}
	
	//NATIVE QUERY
	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE cedula = :datoCedula ", Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorEdadNative(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE edad = :datoEdad ", Estudiante.class);
		myQuery.setParameter("datoEdad", edad);
		return (List<Estudiante>) myQuery.getResultList();
	}
	
		//NAAMED NATIVE QUERY 
	@Override
	public List<Estudiante>  buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellidoNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorIddNative(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorIdNative", Estudiante.class);
		myQuery.setParameter("datoId", id);
		return myQuery.getSingleResult();
	}

}
