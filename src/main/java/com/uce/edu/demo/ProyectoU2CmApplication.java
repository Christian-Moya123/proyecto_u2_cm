package com.uce.edu.demo;



import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;



@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner {
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;

	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Insetar
		Persona persona = new Persona();
		persona.setApellido("asdasd");
		persona.setNombre("aaaaaaaaaaaa");
		persona.setId(5);
		
		//this.iPersonaJdbcService.guardar(persona);
		
		
		Persona per1 = new Persona();
		per1.setId(1);
		per1.setNombre("Maria");
		per1.setApellido("Moya");
		
		//Actualizar
		//this.iPersonaJdbcService.actualizar(per1);
		
		//Eliminar
		//this.iPersonaJdbcService.eliminara(5);
		
		//Buscar
		logger.error(this.iPersonaJdbcService.buscar(3).toString()); 
		
		
	}
		
}
