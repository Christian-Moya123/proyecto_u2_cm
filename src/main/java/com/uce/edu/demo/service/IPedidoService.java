package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Pedido;

public interface IPedidoService {
	
	public void insertarPedido(Pedido pedido);
	
	public Pedido buscarPorId(Integer id);
	public void actualizarPorId(Pedido pedido);
	public void eliminarPorId(Integer id);

}
