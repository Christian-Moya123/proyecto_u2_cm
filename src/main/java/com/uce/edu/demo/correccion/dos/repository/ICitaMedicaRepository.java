package com.uce.edu.demo.correccion.dos.repository;

import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	public void insertarCitaMedica(CitaMedica citaMedica);
	
	public void actualizar(CitaMedica citaMedica);
	
	public CitaMedica buscarPorNumero(String numero);

}
