package com.uce.edu.demo.correccion.dos.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;

public interface IGestorCitaMedicaService {
	
	public void agendarCitaMedica(String numero,LocalDateTime fecha, BigDecimal valor,String lugar, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaPrioximaCta);
}
