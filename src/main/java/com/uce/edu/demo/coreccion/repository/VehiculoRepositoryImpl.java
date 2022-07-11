package com.uce.edu.demo.coreccion.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.coreccion.modelo.Vehiculo;


@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public int actualizarPorPlaca(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createQuery("UPDATE Vehiculo v SET v.tipo = :datoTipo, v.marca = :datoMarca, v.precio = :datoPrecio WHERE p.placa = :datoPlaca");
		myQuery.setParameter("datoTipo", vehiculo.getTipo());
		myQuery.setParameter("datoMarca", vehiculo.getMarca());
		myQuery.setParameter("datoPrecio",vehiculo.getPrecio());
		myQuery.setParameter("datoPlaca", vehiculo.getPlaca());
		
		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createQuery("DELETE FROM  Vehiculo v WHERE v.placa = :datoPlaca");
		myQuery.setParameter("datoPlaca", placa);
		
		
		return myQuery.executeUpdate();
	}

	@Override
	public List<Vehiculo> buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v where p.placa = :datoPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return myQuery.getResultList();
	}

	
	

}
