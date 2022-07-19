package com.uce.edu.demo;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.coreccion.modelo.Propietario;
import com.uce.edu.demo.coreccion.modelo.Vehiculo;
import com.uce.edu.demo.coreccion.service.IMatriculaGestorService;
import com.uce.edu.demo.coreccion.service.IPropietarioService;
import com.uce.edu.demo.coreccion.service.IVehiculoService;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IEstudianteJpaService;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;

import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;



@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner {
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);
	
	
	//@Autowired
	//private IPersonaJdbcService iPersonaJdbcService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired 
	private IEstudianteJpaService iEstudianteJpaService;
	/*
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;*/
	
	
	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona per1 = new Persona();
		per1.setApellido("velascas");
		per1.setCedula("0011");
		per1.setNombre("Alexander");
		per1.setGenero("masculino");
		
		//this.iPersonaJpaService.insertar(per1);
		
		
		//type query
	/*
		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaType("0011");
		logger.info("persona con typed " + perTyped);
		
		//named query
		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("0011");
		logger.info("persona con Named " + perNamed);
		
		//typed y named query
		Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaNamedTyped("001");
		logger.info("persona con TypedNamed " + perTypedNamed);
		
		//varios named query
		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombreApellido("Paez", "Alex2");
		
		for(Persona item:listaPersona) {
			logger.info("persona: " + item);
		}*/
		
		
	/*	//NATIVE QUERY
		Persona perNativeQuery = this.iPersonaJpaService.buscarPorCedulaNative("001");
		logger.info("persona con Native query " + perNativeQuery);
		
		//Named NATIVE QUERY
		Persona perNamedNativeQuery = this.iPersonaJpaService.buscarPorCedulaNamedNative("002");
		logger.info("persona con Named Native query " + perNamedNativeQuery);
		
		//Criteria API
		Persona perCriteriaApiQuery = this.iPersonaJpaService.buscarPorCedulaCriteriaApi("002");
		logger.info("persona con Criteriaa API " + perCriteriaApiQuery);
		
		//Criteria API dinmica
		List<Persona> listaPersona1 = this.iPersonaJpaService.buscarPorDinamicamnteCriteriaApi("Paez", "Alex2","masculino");
		
		for(Persona item:listaPersona1) {
			logger.info("persona: " + item);
		}
		
		List<Persona> listaPersona2 = this.iPersonaJpaService.buscarPorDinamicamnteCriteriaApi("Charro", "Maria","femenino");
		
		for(Persona item:listaPersona2) {
			logger.info("persona con and y or: " + item);
		}*/
		
		List<PersonaSencilla> listaPersona =  this.iPersonaJpaService.buscarPorApellidoSencillos("Alex");
		for(PersonaSencilla perItem:listaPersona) {
			logger.info("PERSONA sencilla " + perItem);
			
		}
		
		List<PersonaContadorGenero> listaPersonaContadasGenero = iPersonaJpaService.consultarCantidadPorGenero();
		for(PersonaContadorGenero perItem:listaPersonaContadasGenero) {
			logger.info("PERSONAs contadas por genero  " + perItem);
			
		}
	}
		
}
