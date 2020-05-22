package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDao {
	public List<Estudiante> findAll() throws DataAccessException;
	public void create(Estudiante estudiante) throws DataAccessException;
	public void findOneAndDelete(Integer code) throws DataAccessException;
	
}