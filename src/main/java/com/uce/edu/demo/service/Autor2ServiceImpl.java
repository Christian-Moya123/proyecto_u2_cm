package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.manytomany.segundaf.Autor2;
import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.ICiudadanoJpaRepository;

@Service
public class Autor2ServiceImpl implements IAutor2Service{

	@Autowired
	private IAutor2Repository  iautorJpaRepository; 
	
	@Override
	public void insertarAutor(Autor2 autor) {
		// TODO Auto-generated method stub
		this.iautorJpaRepository.insertarAutor(autor);
	}

}
