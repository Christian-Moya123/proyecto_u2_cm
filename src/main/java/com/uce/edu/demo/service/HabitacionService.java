package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHabitacionJpaRepository;
import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;

@Service
public class HabitacionService implements IHabitacionService {
	@Autowired
	private IHabitacionJpaRepository  iHobitacionRepository ; 

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHobitacionRepository.insertar(habitacion);
	}

}
