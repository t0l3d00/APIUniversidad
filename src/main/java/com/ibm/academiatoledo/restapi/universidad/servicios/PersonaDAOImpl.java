package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academiatoledo.restapi.universidad.repositorios.PersonaRepository;

@NoRepositoryBean
public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements PersonaDAO
{
	public PersonaDAOImpl(PersonaRepository repository) 
	{
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) 
	{
		return repository.buscarPorNombreYApellido(nombre, apellido);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorDni(String dni) 
	{
		return repository.buscarPorDni(dni);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarPorApellido(String apellido) 
	{
		return repository.buscarPorApellido(apellido);
	}

}
