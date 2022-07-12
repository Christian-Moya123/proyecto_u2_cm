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
		Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaNamedTyped("0011");
		logger.info("persona con TypedNamed " + perTypedNamed);
		
		//varios named query
		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombreApellido("Paez", "Alex2");
		
		for(Persona item:listaPersona) {
			logger.info("persona: " + item);
		}*/
		
		Estudiante estu1 = new Estudiante();
		estu1.setApellido("Marin");
		estu1.setNombre("Anabel");
		estu1.setCedula("0010");
		estu1.setEdad(15);
		estu1.setId(4);
		//this.iEstudianteJpaService.guardarEstudiante(estu1);
		
		//type query Estudiante
		Estudiante estuTyped1 = this.iEstudianteJpaService.buscarPorCedulaType("0010");
		logger.info("estudiante con typed: " + estuTyped1);
		
		List<Estudiante> listaEstuTyped2 =  this.iEstudianteJpaService.buscarPorNombreApellidoType("Anabel","Marin");
		for(Estudiante item:listaEstuTyped2) {
			logger.info("estudiante2 con typed: " + item);
		}
		
		//named query Estudiante
		List<Estudiante> listaEstuNamed1 =  this.iEstudianteJpaService.buscarPorNombreConANamed("Anabel");
		for(Estudiante item:listaEstuNamed1) {
			logger.info("estudiante1 con named: " + item);
		}
		
		List<Estudiante> listaEstuNamed2 =  this.iEstudianteJpaService.buscarPorEdadNamed(19);
		for(Estudiante item:listaEstuNamed2) {
			logger.info("estudiante2 con named: " + item);
		}
		
		//named query Estudiante
		Estudiante EstuNamedTyped1 =  this.iEstudianteJpaService.buscarPorCedulaNamedTyped("0010");
		logger.info("estudiante con typedNamed: " + EstuNamedTyped1);
		
		
		List<Estudiante> listaEstuNamedTyped2 =  this.iEstudianteJpaService.buscarPorNombreApellidoNamedType("Anabel","Marin");
		for(Estudiante item:listaEstuNamedTyped2) {
			logger.info("estudiante2 con namedTped: " + item);
		}
	}
		
}
