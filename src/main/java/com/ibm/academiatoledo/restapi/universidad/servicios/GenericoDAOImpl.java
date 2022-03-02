package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;



import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Carrera;



public class GenericoDAOImpl <E, R extends CrudRepository<E, Long> > implements GenericoDAO<E>

{

	protected final R repository;
	
	public GenericoDAOImpl(R repository)
	{
	   this.repository = repository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Carrera> buscarPorId(Long id) 
	{
		return (Optional<Carrera>) repository.findById(id);
	}

	@Override
	@Transactional
	public E guardar(E entidad) 
	{
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos()
	{
		return repository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) 
	{
		repository.deleteById(id);		
	}

}
