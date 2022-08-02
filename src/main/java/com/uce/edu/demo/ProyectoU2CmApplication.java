package com.uce.edu.demo;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.coreccion.modelo.Matricula;
import com.uce.edu.demo.coreccion.modelo.Propietario;
import com.uce.edu.demo.coreccion.modelo.Vehiculo;
import com.uce.edu.demo.coreccion.service.IMatriculaGestorService;
import com.uce.edu.demo.coreccion.service.IPropietarioService;
import com.uce.edu.demo.coreccion.service.IVehiculoService;
import com.uce.edu.demo.correccion.dos.modelo.CitaMedica;
import com.uce.edu.demo.correccion.dos.modelo.Doctor;
import com.uce.edu.demo.correccion.dos.modelo.Paciente;
import com.uce.edu.demo.correccion.dos.modelo.PacienteSensillo;
import com.uce.edu.demo.correccion.dos.service.IDoctorService;
import com.uce.edu.demo.correccion.dos.service.IGestorCitaMedicaService;
import com.uce.edu.demo.correccion.dos.service.IPacienteService;
import com.uce.edu.demo.manytomany.Autor;
import com.uce.edu.demo.manytomany.Libro;
import com.uce.edu.demo.manytomany.segundaf.Autor2;
import com.uce.edu.demo.manytomany.segundaf.AutorLibro2;
import com.uce.edu.demo.manytomany.segundaf.Libro2;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorSencilla;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Pasaporte;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.repository.modelo.onetomany.Cliente;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.repository.modelo.onetomany.Pedido;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;
import com.uce.edu.demo.repository.modelo.onetoone.Empleado;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ICiudadanoJpaService;
import com.uce.edu.demo.service.IClienteJpaService;
import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelJpaServioce;
import com.uce.edu.demo.service.ILibro2Service;
import com.uce.edu.demo.service.ILibroAutorService;
import com.uce.edu.demo.service.ILibroService;
import com.uce.edu.demo.service.IPedidoService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.taller27.cajero.modelo.DetalleFactura;
import com.uce.edu.demo.taller27.cajero.modelo.Factura;
import com.uce.edu.demo.taller27.cajero.service.IFacturaService;
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
	
	@Autowired
	private IClienteJpaService clienteService ;
	
	@Autowired
	private IPedidoService pedidoService ;
	
	@Autowired
	private ILibroService libroService ;
	
	@Autowired
	private IAutor2Service autor2Service ;
	
	@Autowired
	private ILibro2Service libro2Service ;
	
	@Autowired
	private ILibroAutorService libroAutor2Service ;
	
	@Autowired
	private IFacturaService facturaService ;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IGestorCitaMedicaService citaMedicaService;

	
	public static void main(String[] args)  {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Doctor doc1=  new Doctor();
		doc1.setCedula("0001");
		doc1.setNombre("Abel");
		doc1.setApellido("Solano");
		doc1.setFechaNacimiento(LocalDateTime.of(1959, 12,22,0,0));
		doc1.setNumeroConsultorio("ccc2");
		doc1.setCodigoSenescyt("aa1");
		doc1.setGenero("M");
		
		Doctor doc2=  new Doctor();
		doc2.setCedula("0002");
		doc2.setNombre("Anastacia");
		doc2.setApellido("Merinda");
		doc2.setFechaNacimiento(LocalDateTime.of(1959, 12,22,0,0));
		doc2.setNumeroConsultorio("ccc3");
		doc2.setCodigoSenescyt("aa4");
		doc2.setGenero("F");
		
		//this.doctorService.insertar(doc1);
		//this.doctorService.insertar(doc2);
		
		//Funcionalidad 2 Insertar Pacientes
		
		
		Paciente pa2 = new Paciente();
		pa2.setCedula("003");
		pa2.setNombre("Maria");
		pa2.setApellido("Tumbaico");
		pa2.setFechaNacimiento(LocalDateTime.of(1899, 5, 6, 0, 0));
		pa2.setCodigoSeguro("000b");
		pa2.setEstatura(new Double("44"));
		pa2.setPeso(new Double("444"));
		pa2.setGenero("F");
		
	
		//this.pacienteService.insertar(pa2);
		 
		 this.citaMedicaService.agendarCitaMedica("01", LocalDateTime.of(2018, 5,5,0,0), new BigDecimal(100), "Quitumbe", "0002", "003");
	
		 //this.citaMedicaService.actualizarCita("01", "aaa", "ssssssss", LocalDateTime.now());
	
		 
		 List<PacienteSensillo > listaPacientes = this.pacienteService.buscar(LocalDateTime.of(1898, 5,5,0,0), "M");
			
			for(PacienteSensillo pItem:listaPacientes) {
				logger.debug("rEPORTE DE PERSONAS  " + pItem);

			}
		
	}
		
}
