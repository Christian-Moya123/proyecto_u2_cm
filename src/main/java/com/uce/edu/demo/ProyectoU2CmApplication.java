package com.uce.edu.demo;



import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner {
	
	private static Logger logger = Logger.getLogger(ProyectoU2CmApplication.class);

	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//debug< mensajes de depuracion
		//info;mensajes informativos
		//warn; alartar eventos que se quiren dejar constaancia, pero mno afecta el duncionamiento de la aplicacion
		//error; alrta evtos que afectan al prrograma, pero no dejan de funcionar 	
		//fatal errores criticos , despues de guardar el mensake el porgma termina
		System.out.println("hola mundo");
		logger.debug("LOG debug");
		logger.info("LOG info");
		logger.warn("LOG warn");
		logger.error("LOG error");
		logger.fatal("LOG FATAL");
	}
		
}
