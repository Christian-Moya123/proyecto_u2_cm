package com.uce.edu.demo.correccion.dos.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.modelo.Paciente;
import com.uce.edu.demo.correccion.dos.modelo.PacienteSensillo;


@Repository
@Transactional
public class PacienteRepositoryImpl  implements IPacienteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
		
	
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return 	this.entityManager.find( Paciente.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		Paciente pa = this.buscar(codigo);
		this.entityManager.remove(pa);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente>  miQuery = this.entityManager.createQuery("SELECT p FROM Paciente WHERE p.cedula = :datoCedula" , Paciente.class);
		miQuery.setParameter("datoCedula", cedula);
		return miQuery.getSingleResult();
	}

	@Override
	public List<PacienteSensillo> buscar(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteSensillo> miQuery = this.entityManager.createQuery(
				"Select New com.uce.edu.demo.correccion.dos.modelo.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero) from Paciente p where p.fechaNacimiento > :fecha and p.genero = : genero", PacienteSensillo.class);
		miQuery.setParameter("fecha", fecha);
		miQuery.setParameter("genero", genero);
		return miQuery.getResultList();
	}
	
	
	
}
