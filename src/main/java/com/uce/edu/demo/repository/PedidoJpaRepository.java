package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

@Repository
@Transactional
public class PedidoJpaRepository implements IPedidoJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pedido);
	}

	@Override
	public Pedido buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return  this.entityManager.find(Pedido.class, id);
	}

	@Override
	public void actualizarPorId(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pedido);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Pedido pedido = this.buscarPorId(id);
		this.entityManager.remove(pedido);
	}

}
