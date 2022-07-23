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
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.ICiudadanoJpaService;
import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelJpaServioce;
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
	
	@Autowired
	private IHotelJpaServioce  iHotelJpaServioce;
	
	@Autowired
	private IHabitacionService HabitacionService ;
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
		
		Hotel hotel1= new Hotel();
		hotel1.setNombre("Gilton Colon GYU");
		hotel1.setDireccion("Malecon");
		
		//this.iHotelJpaServioce.insertarHotel(hotel1);
		
		
		//PARA INGRESAR HABITACIONES con el dato de hotel
		//buscar el hotel por un numero , vasta con el id ingresar a las habitaciones
		Hotel hote = new Hotel();
		hote.setId(1);
		
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A2334");
		habi1.setPiso("10");
		habi1.setTipo("ffamiliar");
		habi1.setHotel(hote);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("A2334");
		habi2.setPiso("10");
		habi2.setTipo("matrimoniar");
		habi2.setHotel(hote);
		
		
		this.HabitacionService.insertar(habi1);
		this.HabitacionService.insertar(habi2);
		
		
		
		
	}
		
}
