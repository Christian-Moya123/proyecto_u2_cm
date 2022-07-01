package com.uce.edu.demo;



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
		logger.info("Datos con Jpa: " + this.iEstudianteJpaService.buscarEstudiante(5).toString());
		/*
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
		//this.iPersonaJpaService.eliminar(1);
		
		*/
		
		Estudiante estu = new Estudiante();
		estu.setId(10);
		estu.setNombre("AAABEl");
		estu.setApellido("Angulo");
		estu.setEdad(19);
		estu.setCedula("0888");
		
		//this.iEstudianteJpaService.guardarEstudiante(estu);
		
		Estudiante estu2 = new Estudiante();
		estu2.setId(10);
		estu2.setNombre("Abel");
		estu2.setApellido("Angulo");
		estu2.setEdad(19);
		estu2.setCedula("0888");
		//this.iEstudianteJpaService.actualizarEstudiante(estu2);
		this.iEstudianteJpaService.eliminaraEstudiante(5);
		
	}
		
}
