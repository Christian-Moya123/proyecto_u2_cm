package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.manytomany.Libro;

@Repository
@Transactional
public class LibroRepsositoryImpl implements ILibroRepsository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		 this.entityManager.persist(libro);
	}

}
