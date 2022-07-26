package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

public interface IClienteJpaRepository {

	public void insertarCliente(Cliente cliente);
	
	public Cliente buscarPorId(Integer id);
	public void actualizarPorId(Cliente cliente);
	public void eliminarPorId(Integer id);
}
