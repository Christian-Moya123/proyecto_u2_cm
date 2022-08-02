package com.uce.edu.demo.correccion.dos.service;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;
import com.uce.edu.demo.correccion.dos.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	private ICitaMedicaRepository citaMedicaRepositori;

	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		
		// TODO Auto-generated method stub
		 this.citaMedicaRepositori.insertarCitaMedica(citaMedica);
	}

	

	
}
