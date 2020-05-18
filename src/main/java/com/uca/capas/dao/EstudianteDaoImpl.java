package com.uca.capas.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Estudiante;

@Repository
public class EstudianteDaoImpl implements EstudianteDao{
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("Select * from public.estudiante");
		Query query = entityManager.createNativeQuery(sb.toString(), Estudiante.class);
		List<Estudiante> resulset = query.getResultList();
		
		return resulset;
	}

	@Override
	@Transactional
	public void create(Estudiante estudiante) throws DataAccessException {
		entityManager.persist(estudiante);
	}  
}
