package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.IPersonaJpaRepository;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class CiudadanoJpaService  implements ICiudadanoJpaService{
	
	@Autowired
	private ICiudadanoJpaRepository  iCiudadanoJpaRepository; 

	@Override
	public void insertarCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoJpaRepository.buscarPorId(id);
	}

	@Override
	public void actualizarPorId(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.actualizarPorId(ciudadano);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.eliminarPorId(id);
	}

}
