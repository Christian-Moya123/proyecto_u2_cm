package com.uce.edu.demo.correccion.dos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;

@Service
@Transactional
public class CitaMedicaRepository implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	


	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		 this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> miQuery = this.entityManager.createQuery("SELECT c from CitaMedica c Where c.numero = :datoNumero", CitaMedica.class);
		miQuery.setParameter("datoNumero", numero);
		return  miQuery.getSingleResult();
	}

}
