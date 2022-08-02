package com.uce.edu.demo.correccion.dos.service;

import com.uce.edu.demo.correccion.dos.modelo.Paciente;

public interface IPacienteService{

	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(Integer codigo);
	public void eliminar(Integer codigo);
	
	
}
