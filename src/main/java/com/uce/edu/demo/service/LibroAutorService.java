package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.manytomany.segundaf.Autor2;
import com.uce.edu.demo.manytomany.segundaf.AutorLibro2;
import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.ILibroAutor2Repository;

@Service
public class LibroAutorService implements ILibroAutorService{
	
	@Autowired
	private ILibroAutor2Repository  iautorLibroJpaRepository;

	@Override
	public void insertarAutorLibro(AutorLibro2 autor) {
		// TODO Auto-generated method stub
		this.iautorLibroJpaRepository.insertarAutorLibro(autor);
	} 
	

}
