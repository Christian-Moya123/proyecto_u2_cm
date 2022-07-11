package com.uce.edu.demo.coreccion.repository;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.uce.edu.demo.coreccion.modelo.Propietario;
import com.uce.edu.demo.repository.modelo.Persona;



@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public int eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		Query myQuery =this.entityManager.createQuery("DELETE FROM Propietario p WHERE p.cedula = :datoCedula ");
		myQuery.setParameter("datoCedula", cedula);
		
		
		return myQuery.executeUpdate();
	}
	
	@Override
	public Propietario consultarCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p where p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		return (Propietario) jpqlQuery.getSingleResult();
	}

}
