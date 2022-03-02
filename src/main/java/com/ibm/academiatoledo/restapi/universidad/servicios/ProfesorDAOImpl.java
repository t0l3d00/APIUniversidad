package com.ibm.academiatoledo.restapi.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academiatoledo.restapi.universidad.repositorios.PersonaRepository;
import com.ibm.academiatoledo.restapi.universidad.repositorios.ProfesorRepository;


public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{
	@Autowired
	
	public ProfesorDAOImpl(@Qualifier("repositorioProfesor")PersonaRepository repository)
	{
		super(repository);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findProfesoresByNombreCarrera(String nombreCarrera)
	{
		
		return ((ProfesorRepository)repository).findProfesoresByNombreCarrera(nombreCarrera);
	}

	
}
