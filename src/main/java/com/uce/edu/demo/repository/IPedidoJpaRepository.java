package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

public interface IPedidoJpaRepository {
	
	public void insertarPedido(Pedido pedido);
	
	public Pedido buscarPorId(Integer id);
	public void actualizarPorId(Pedido pedido);
	public void eliminarPorId(Integer id);

}
