package com.uce.edu.demo;



import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.PersonaTo;



@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner {
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);
	
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Datos con Jpa: " + this.iPersonaJpaService.buscarPorId(3).toString());
		
		Persona per = new Persona();
		per.setId(7);
		per.setApellido("ANdaluz");
		per.setNombre("Luis");
		
		//insertar
		//this.iPersonaJpaService.insertar(per);
		
		Persona per2 = new Persona();
		per2.setId(7);
		per2.setApellido("Andaluz");
		per2.setNombre("Abel");
		
		//actualizar
		//this.iPersonaJpaService.actualizar(per2);
		
		//eliminar
		this.iPersonaJpaService.eliminar(1);
		
	}
		
}
