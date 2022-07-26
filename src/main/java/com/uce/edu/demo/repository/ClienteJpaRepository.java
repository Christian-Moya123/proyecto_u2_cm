package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Repository
@Transactional
public class ClienteJpaRepository implements IClienteJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return  this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void actualizarPorId(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = this.buscarPorId(id);
		this.entityManager.remove(cliente);
	}

}
