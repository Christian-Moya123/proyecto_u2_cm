package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IClienteJpaRepository;
import com.uce.edu.demo.repository.IPedidoJpaRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

@Service
public class PedidoService implements IPedidoService {

	@Autowired
	private IPedidoJpaRepository  iPedidoJpaRepository; 
	
	@Override
	public void insertarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		this.iPedidoJpaRepository.insertarPedido(pedido);
	}

	@Override
	public Pedido buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPedidoJpaRepository.buscarPorId(id);
	}

	@Override
	public void actualizarPorId(Pedido pedido) {
		// TODO Auto-generated method stub
		this.iPedidoJpaRepository.actualizarPorId(pedido);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.iPedidoJpaRepository.eliminarPorId(id);
	}

}
