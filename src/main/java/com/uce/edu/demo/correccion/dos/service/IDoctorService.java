package com.uce.edu.demo.correccion.dos.service;

import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.modelo.Paciente;

public interface IDoctorService {
	public void insertar(Doctor paciente);
	public void actualizar(Doctor paciente);
	public Doctor buscar(Integer codigo);
	public void eliminar(Integer codigo);

}
