package com.uce.edu.demo.coreccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.coreccion.modelo.Vehiculo;
import com.uce.edu.demo.coreccion.repository.IVehiculoRepository;


@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertarV(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizarV(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizarPorPlaca(vehiculo);
	}

	@Override
	public void eliminarV(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminarPorPlaca(placa);
	}

	@Override
	public Vehiculo buscarV(String placa) {
		// TODO Auto-generated method stub
		return (Vehiculo) this.iVehiculoRepository.buscarPorPlaca(placa);
	}

}
