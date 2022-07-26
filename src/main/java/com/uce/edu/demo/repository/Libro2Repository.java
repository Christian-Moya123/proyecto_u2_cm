package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.manytomany.segundaf.Libro2;

@Repository
@Transactional
public class Libro2Repository implements ILibro2Repository{


	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarLibro(Libro2 libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}
}
