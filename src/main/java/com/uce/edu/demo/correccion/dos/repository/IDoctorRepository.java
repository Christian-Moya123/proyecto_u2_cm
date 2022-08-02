package com.uce.edu.demo.correccion.dos.repository;

import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.modelo.Paciente;

public interface IDoctorRepository {
	public void insertar(Doctor paciente);
	public void actualizar(Doctor paciente);
	public Doctor buscar(Integer codigo);
	public void eliminar(Integer codigo);
	
	public Doctor buscarOPorCedula(String cedula);
}
