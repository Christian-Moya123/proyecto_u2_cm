package com.uce.edu.demo.coreccion.service;

import com.uce.edu.demo.coreccion.modelo.Vehiculo;

public interface IVehiculoService {
	public void insertarV(Vehiculo vehiculo);
	public void actualizarV(Vehiculo vehiculo);
	public void eliminarV(String placa);
	public Vehiculo buscarV(String placa);

}
