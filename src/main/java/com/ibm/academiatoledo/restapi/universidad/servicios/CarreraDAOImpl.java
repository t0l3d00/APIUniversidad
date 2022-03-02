package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academiatoledo.restapi.universidad.repositorios.CarreraRepository;


@Service
public class CarreraDAOImpl<E> extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO
{
	@Autowired
	public CarreraDAOImpl(CarreraRepository carreraRepository) 
	{
		super(carreraRepository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre) 
	{
		return repository.findCarrerasByNombreContains(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) 
	{
		return repository.findCarrerasByNombreContainsIgnoreCase(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios)
	{
		return repository.findCarrerasByCantidadAniosAfter(cantidadAnios);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByProfesorNombreYApellido(String nombre, String apellido)  
	{
		
		return repository.findCarrerasByProfesorNombreYApellido(nombre, apellido);
	} 
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Carrera> buscarPorId(Long carreraId) 
	{
		return repository.findById(carreraId);
		
		
	}	
	
	@Override
	@Transactional
	public Carrera actualizar(Long carreraId, Carrera carrera) 
	{
		Optional<Carrera> oCarrera = repository.findById(carreraId);
		
		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con ID %d no existe", carreraId)); 
		
		Carrera carreraActualizada = null;
		oCarrera.get().setCantidadAnios(carrera.getCantidadAnios());
		oCarrera.get().setCantidadMaterias(carrera.getCantidadMaterias());
		carreraActualizada = repository.save(oCarrera.get());
		return carreraActualizada;
	}
	
	
}
