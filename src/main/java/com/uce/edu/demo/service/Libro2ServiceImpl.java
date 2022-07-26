package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.manytomany.segundaf.Libro2;
import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.ILibro2Repository;

@Service
public class Libro2ServiceImpl implements ILibro2Service{
	@Autowired
	private ILibro2Repository ilibroJpaRepository;

	@Override
	public void insertarLibro(Libro2 libro) {
		// TODO Auto-generated method stub
		this.ilibroJpaRepository.insertarLibro(libro);
	} 

}
