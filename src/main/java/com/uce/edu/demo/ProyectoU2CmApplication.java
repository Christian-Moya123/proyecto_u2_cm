package com.uce.edu.demo;



import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired IEstudianteJpaService iEstudianteJpaService;
	
	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//buscar
		//logger.info("Datos con Jpa: " + this.iPersonaJpaService.buscarPorId(7));
		
		Persona per = new Persona();
		//per.setId(8);
		per.setApellido("Maria");
		per.setNombre("Charro");
		per.setCedula("002");
		per.setGenero("femenino");
		
		//insertar
		//this.iPersonaJpaService.insertar(per);
		
		//buscar pòr cedula
		
		//logger.info("Datos con Jpa: " + this.iPersonaJpaService.buscarCedula("001"));
		
		//buscar pòr apellido
		List<Persona> listaPersona = this.iPersonaJpaService.buscarApellido("Alex2");
		for(Persona item : listaPersona) {
			logger.info("Persona: "+ item);
		}
		
		
		//buscar pòr nombre
		List<Persona> listaPersonaNombre = this.iPersonaJpaService.buscarNombre("Paez");
				for(Persona item : listaPersonaNombre) {
					logger.info("Nombre de la Persona: "+ item);
				}
				
		//buscar pòr genero
		List<Persona> listaPersonaGenero = this.iPersonaJpaService.buscarGenero("masculino");
				for(Persona item : listaPersonaGenero) {
					logger.info("Genero de la Persona: "+ item);
				}		
		
		//actualizar
		Persona per2 = new Persona();
		per2.setId(7);
		per2.setApellido("Andaluz");
		per2.setNombre("Abel");
		
		//this.iPersonaJpaService.actualizar(per2);
		
		//eliminar
		//this.iPersonaJpaService.eliminar(1);
		
		
		
		
		
	}
		
}
