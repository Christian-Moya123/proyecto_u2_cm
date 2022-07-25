package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.IClienteJpaRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Cliente;

@Service
public class ClienteJpaService implements IClienteJpaService{
	
	@Autowired
	private IClienteJpaRepository  iClienteJpaRepository; 

	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteJpaRepository.insertarCliente(cliente);
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iClienteJpaRepository.buscarPorId(id);
	}

	@Override
	public void actualizarPorId(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteJpaRepository.actualizarPorId(cliente);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.iClienteJpaRepository.eliminarPorId(id);
	}

}
