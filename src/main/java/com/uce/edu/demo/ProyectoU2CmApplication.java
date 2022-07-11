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
	
	/*
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired IEstudianteJpaService iEstudianteJpaService;*/
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	
	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//buscar
	/*	//logger.info("Datos con Jpa: " + this.iPersonaJpaService.buscarPorId(7));
		
		//actualizar
		//int resultado = this.iPersonaJpaService.actualizarPorApellido("MA", "Mar");
		//logger.info("Cantidad de resgistros actuliazados : "+ resultado);
		
		//eliminar
		this.iPersonaJpaService.eliminarPorGenero("MA");*/
		
		//Punto
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("toyota");
		vehiculo.setPlaca("sts2222");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("L");
		
		this.iVehiculoService.insertarV(vehiculo);
		
		//Punto 2
		vehiculo.setPrecio(new BigDecimal(3500));
		vehiculo.setMarca("AWM");
		//this.iVehiculoService.actualizarV(vehiculo);
		
		
		//Punto 3
		Propietario pro = new Propietario();
		pro.setApellido("Moya");
		pro.setNombre("Christian");
		pro.setCedula("12312312");
		pro.setFecha(LocalDateTime.now());
		this.iPropietarioService.crear(pro);
		
		//Punto 4
		//this.iMatriculaGestorService.generarMaatricula("12312312", "sts2222");
		
		
	}
		
}
