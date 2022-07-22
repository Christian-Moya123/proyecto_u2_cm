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
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorSencilla;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Pasaporte;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.service.ICiudadanoJpaService;
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
	
	@Autowired
	private ICiudadanoJpaService iCiudadanoJpaService; 
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
		
		Ciudadano ciu1= new Ciudadano();
		ciu1.setApellido("Maria2");
		ciu1.setNombre("Ana2");
		
		
		
		Empleado empl1 = new Empleado();
		empl1.setCodigoIess("001122");
		empl1.setSalario(new BigDecimal(1001));
		empl1.setCiudadano(ciu1);
		
		ciu1.setEmpleado(empl1);
		
		//this.iCiudadanoJpaService.insertarCiudadano(ciu1);
		/*
		Ciudadano ciu2= new Ciudadano();
		ciu1.setApellido("Maria2");
		ciu1.setNombre("Ana2");
		
		
		
		Empleado empl2 = new Empleado();
		empl2.setCodigoIess("001122");
		empl2.setSalario(new BigDecimal(100));
		empl2.setCiudadano(ciu1);
		
		ciu1.setEmpleado(empl1);
		
		this.iCiudadanoJpaService.insertarCiudadano(empl2);*/
		
		Ciudadano ciu2 = new Ciudadano();
		ciu2.setApellido("Cardobal6");
		ciu2.setCedula("0016");
		ciu2.setFechaNacimiento(LocalDateTime.of(2012, 1,23,0,0));
		ciu2.setNombre("Alexander6");
		
		
		Pasaporte pasa1 = new Pasaporte();
		pasa1.setFechaCaducidad(LocalDateTime.of(2032, 11,23,0,0));
		pasa1.setFechaEmision(LocalDateTime.now());
		pasa1.setNumero(100);
		pasa1.setCiudadano(ciu2);
		
		ciu2.setPasaporte(pasa1);
		
		//INSERTAR
		this.iCiudadanoJpaService.insertarCiudadano(ciu2);
		
		//Eliminar
		//this.iCiudadanoJpaService.eliminarPorId(11);
		
		//Buscar
		logger.info("se busca el ciudadano " + this.iCiudadanoJpaService.buscarPorId(13));
		
		//ACTUALIZAR
		ciu2.setApellido("Toapanta");
		//this.iCiudadanoJpaService.actualizarPorId(ciu2);
		
		
	}
		
}
