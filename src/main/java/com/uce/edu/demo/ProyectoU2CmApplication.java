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
		
		
		
		Hotel hotel1= new Hotel();
		hotel1.setNombre("Gilton Colon GYU");
		hotel1.setDireccion("Malecon");
		////////////////////////////////////////////////
		
		
	
		Libro libro1 = new Libro();
		libro1.setTitulo("AAA3");
		libro1.setCantidadPaginas(20);
		
		
		
		Autor autor1 = new Autor();
		autor1.setNombre("Alex3");
		
		Autor autor2 = new Autor();
		autor2.setNombre("Alex 2");
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor1);
		autores.add(autor2);
		
		libro1.setAutores(autores);
		
		//this.libroService.insertarLibro(libro1);
		
/*
		Factura fact = this.facturaService.consultarFactura(1);
		logger.info("numero " + fact.getNumero());
		logger.info("fecha " +fact.getFecha());
		
		
		logger.info("cliente " + fact.getCliente().getNumeroTarjeta());
		
		List<DetalleFactura> detaller = fact.getDetalles();
		
		for(DetalleFactura deta:detaller) {
			logger.info("detalle " + deta);
		}*/
		
		
		//Punto
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("toyota1");
		vehiculo.setPlaca("sts22221");
		vehiculo.setPrecio(new BigDecimal(60000));
		vehiculo.setTipo("L1");

		this.iVehiculoService.insertarV(vehiculo);

		//Punto 2
		vehiculo.setPrecio(new BigDecimal(3500));
		vehiculo.setPlaca("sts2222");
		vehiculo.setMarca("AWM");
		
		
		//this.iVehiculoService.actualizarV(vehiculo);


		//Punto 3
		Propietario pro = new Propietario();
		pro.setApellido("Moya2");
		pro.setNombre("Christian2");
		pro.setCedula("123123122");
		pro.setFecha(LocalDateTime.now());
		
		this.iPropietarioService.crear(pro);

		//Punto 4
		 this.iMatriculaGestorService.generarMaatricula( "123123122","sts22221");
		
		
		 
	
	}
		
}
