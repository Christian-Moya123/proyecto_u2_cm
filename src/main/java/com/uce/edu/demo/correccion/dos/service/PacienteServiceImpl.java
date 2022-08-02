package com.uce.edu.demo.correccion.dos.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.dos.modelo.Paciente;
import com.uce.edu.demo.correccion.dos.modelo.PacienteSensillo;
import com.uce.edu.demo.correccion.dos.repository.IPacienteRepository;


@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository ipaciuenteJpaRepository; 
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.ipaciuenteJpaRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.ipaciuenteJpaRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.ipaciuenteJpaRepository.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
	this.ipaciuenteJpaRepository.eliminar(codigo);	
	}

	@Override
	public List<PacienteSensillo> buscar(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.ipaciuenteJpaRepository.buscar(fecha, genero);
	}

}
