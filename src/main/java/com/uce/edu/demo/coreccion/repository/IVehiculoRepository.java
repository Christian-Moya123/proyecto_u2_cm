package com.uce.edu.demo.coreccion.repository;

import java.util.List;

import com.uce.edu.demo.coreccion.modelo.Vehiculo;
import com.uce.edu.demo.repository.modelo.Persona;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	public int actualizarPorPlaca(Vehiculo vehiculo);
	public int eliminarPorPlaca(String placa);
	public List<Vehiculo> buscarPorPlaca(String placa);
	
	

}
