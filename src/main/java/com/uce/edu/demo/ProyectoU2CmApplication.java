package com.uce.edu.demo;



import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.Persona;



@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner {
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);
	
	
	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;

	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Ivan");
		estudiante.setNombre("Tumbaico");
		estudiante.setId(3);
		estudiante.setCedula("004");
		estudiante.setEdad(19);
		
		
		//this.iEstudianteJdbcService.guardarEstudiante(estudiante);
		
		
		Estudiante estu1 = new Estudiante();
		estu1.setId(5);
		estu1.setNombre("Mario");
		estu1.setApellido("Moya");
		estu1.setCedula("008");
		estu1.setEdad(22);
		//this.iEstudianteJdbcService.actualizarEstudiante(estu1);
		
		//this.iEstudianteJdbcService.eliminaraEstudiante(19);
		
		logger.error(this.iEstudianteJdbcService.buscarEstudiante(22).toString());
	}
		
}
