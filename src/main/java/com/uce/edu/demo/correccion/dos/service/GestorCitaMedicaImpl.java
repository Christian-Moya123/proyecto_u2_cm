package com.uce.edu.demo.correccion.dos.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;
import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.modelo.Paciente;
import com.uce.edu.demo.correccion.dos.repository.ICitaMedicaRepository;
import com.uce.edu.demo.correccion.dos.repository.IDoctorRepository;
import com.uce.edu.demo.correccion.dos.repository.IPacienteRepository;

@Service
public class GestorCitaMedicaImpl  implements IGestorCitaMedicaService{
	@Autowired
	private ICitaMedicaService citaMedicaService;
	@Autowired
	private ICitaMedicaRepository citaMedicaRepo;
	
	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Autowired
	private IPacienteRepository pacienteRepo;

	@Override
	public void agendarCitaMedica(String numero, LocalDateTime fecha, BigDecimal valor,String lugar,String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroCita(numero);
		citaMedica.setFechaCita(fecha);
		citaMedica.setValorCita(valor);
		
		Doctor doctor = this.doctorRepo.buscarOPorCedula(cedulaPaciente);
		Paciente paciente = this.pacienteRepo.buscarPorCedula(cedulaPaciente);
		
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		
		this.citaMedicaService.insertarCitaMedica(citaMedica);
	}

	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaPrioximaCta) {
		// TODO Auto-generated method stub
		  CitaMedica cita = this.citaMedicaRepo.buscarPorNumero(numero);
	        cita.setDiagnostico(diagnostico);
	        cita.setReceta(receta);
	        cita.setFechaProximaCita(fechaPrioximaCta);

	        this.citaMedicaRepo.actualizar(cita);
	}

}
