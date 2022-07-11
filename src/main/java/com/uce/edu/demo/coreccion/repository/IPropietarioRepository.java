package com.uce.edu.demo.coreccion.repository;

import com.uce.edu.demo.coreccion.modelo.Propietario;

public interface IPropietarioRepository {
	public void crear(Propietario propietario);
	public int eliminarPorCedula(String cedula);
	public Propietario consultarCedula(String cedula);

}
