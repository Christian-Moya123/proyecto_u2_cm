package com.uce.edu.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EstudianteTo buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] {id}, 
				new BeanPropertyRowMapper<EstudianteTo>(EstudianteTo.class));
	}

	@Override
	public void insertar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, edad, cedula) values (?, ?, ?, ?, ?)", 
				new Object[] {estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getCedula()});
	}

	@Override
	public void actualizar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		
		this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, edad=?, cedula=? where id=?" ,
				new Object[] {estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getCedula(), estudiante.getId()});
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id=?", 
				new Object[] {id});
	}

}
