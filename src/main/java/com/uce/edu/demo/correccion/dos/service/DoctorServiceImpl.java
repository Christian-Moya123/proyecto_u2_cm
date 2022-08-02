package com.uce.edu.demo.correccion.dos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.repository.IDoctorRepository;
import com.uce.edu.demo.correccion.dos.repository.IPacienteRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {


	@Autowired
	private IDoctorRepository idoctorJpaRepository;

	@Override
	public void insertar(Doctor paciente) {
		// TODO Auto-generated method stub
				this.idoctorJpaRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Doctor paciente) {
		// TODO Auto-generated method stub
		this.idoctorJpaRepository.actualizar(paciente);
	}

	@Override
	public Doctor buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.idoctorJpaRepository.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.idoctorJpaRepository.eliminar(codigo);
	} 
	
}
