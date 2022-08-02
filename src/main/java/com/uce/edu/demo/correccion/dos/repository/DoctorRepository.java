package com.uce.edu.demo.correccion.dos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.dos.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepository implements IDoctorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Doctor paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Doctor buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		Doctor doc = this.buscar(codigo);
		this.entityManager.remove(doc);
	}

	@Override
	public Doctor buscarOPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor>  miQuery = this.entityManager.createQuery("SELECT d FROM  Doctor d WHERE d.cedula = :datoCedula" , Doctor.class);
		miQuery.setParameter("datoCedula", cedula);
		return miQuery.getSingleResult();
	}

}
