package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.manytomany.Libro;
import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.ILibroRepsository;

@Service
public class LibroService implements ILibroService {

	@Autowired
	private ILibroRepsository ilibroJpaRepository; 
	
	@Override
	public void insertarLibro(Libro libro) {
		// TODO Auto-generated method stub
		this.ilibroJpaRepository.insertar(libro);
	}

}
