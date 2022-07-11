package com.uce.edu.demo.coreccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.coreccion.modelo.Matricula;
import com.uce.edu.demo.coreccion.modelo.Propietario;
import com.uce.edu.demo.coreccion.modelo.Vehiculo;
import com.uce.edu.demo.coreccion.repository.IMatriculaRepository;
import com.uce.edu.demo.coreccion.repository.IPropietarioRepository;
import com.uce.edu.demo.coreccion.repository.IVehiculoRepository;



@Service
public class MatriculaGestorImpl implements IMatriculaGestorService{
	
	@Autowired
	private IPropietarioRepository iPropietarioRepos;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepo;
	
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService matriculaServiceP;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService matriculaServiceL;
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	

	@Override
	public void generarMaatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario pro = this.iPropietarioRepos.consultarCedula(cedula);
		Vehiculo vehi = (Vehiculo) this.iVehiculoRepo.buscarPorPlaca(placa);
			
		String tipo = vehi.getTipo();
		BigDecimal valorMaatricula = vehi.getPrecio();
		
		if(tipo.equals("P")) {
			valorMaatricula = this.matriculaServiceP.calcular(vehi.getPrecio());
		}else {
			valorMaatricula = this.matriculaServiceL.calcular(vehi.getPrecio());
			
		}
		
		if(valorMaatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento = valorMaatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			
			valorMaatricula = valorMaatricula.subtract(valorDescuento);
		}
		
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMaatricula);
		matricula.setVehiculo(vehi);
		matricula.setPropietario(pro);
		
		this.matriculaRepository.crear(matricula);
		
	}

}
