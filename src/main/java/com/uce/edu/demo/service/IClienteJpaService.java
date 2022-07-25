package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;

public interface IClienteJpaService {
	
public void insertarCliente(Cliente cliente);
	
	public Cliente buscarPorId(Integer id);
	public void actualizarPorId(Cliente cliente);
	public void eliminarPorId(Integer id);

}
