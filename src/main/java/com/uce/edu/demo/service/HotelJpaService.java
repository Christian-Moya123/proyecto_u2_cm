package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.IHabitacionJpaRepository;
import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;

@Service
public class HotelJpaService implements IHotelJpaServioce{
	
	@Autowired
	private IHotelRepository  iHotelRepository ; 
	
	@Autowired
	private IHabitacionJpaRepository iHabitacionJpaRepository;

	@Override
	public void insertarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		/*
		List<Habitacion> habitaciones  = hotel.getHabitaciones();
		hotel.setHabitaciones(null);
		*/
		this.iHotelRepository.insertarHotel(hotel);
		
		/////////////////////////////////
		//buscar el hotel
		/*String numero = hotel.getNombre();
		Hotel hotelBuscado = null;
		
		for(Habitacion habiItem: habitaciones){
			//caklculos
			habiItem.setHotel(hotelBuscado);
			this.iHabitacionJpaRepository.insertar(habiItem);
		}*/
	}

}
