package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ProyectoU2CmApplication;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Repository
@Transactional
public class CiudadanoJpaRepository implements ICiudadanoJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		 this.entityManager.persist(ciudadano);
	}

	@Override
	public Ciudadano buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void actualizarPorId(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		logger.info("se a actualizado");
		this.entityManager.merge(ciudadano);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		logger.info("se a eliminado el ciudadano" + id);
		Ciudadano ciudadano = this.buscarPorId(id);
		this.entityManager.remove(ciudadano);
	}


}
