package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.manytomany.segundaf.AutorLibro2;

@Repository
@Transactional
public class LibroAutor2Repository  implements ILibroAutor2Repository{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarAutorLibro(AutorLibro2 autorlibro) {
		// TODO Auto-generated method stub
		 this.entityManager.persist(autorlibro);
	}

}
