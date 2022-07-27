package com.uce.edu.demo.taller27.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.taller27.cajero.modelo.Factura;
import com.uce.edu.demo.taller27.cajero.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public Factura consultarFactura(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepository.consultarFactura(id);
	}

}
