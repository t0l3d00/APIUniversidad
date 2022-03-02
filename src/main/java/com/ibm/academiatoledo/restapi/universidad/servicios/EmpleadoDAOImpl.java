package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academiatoledo.restapi.universidad.repositorios.EmpleadoRepository;
import com.ibm.academiatoledo.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academiatoledo.restapi.universidad.repositorios.PersonaRepository;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO
{
	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleado")PersonaRepository repository) 
	{
		super(repository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) 
	{
		
		return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
	}

	@Override
	@Transactional
	public Persona actualizar(Long empleadoId, Persona empleado) 
	{
		Optional<Persona> oEmpleado = repository.findById(empleadoId);

		if(!oEmpleado.isPresent())
			throw new NotFoundException(String.format("El empleado con ID %d no existe",empleadoId));

		Persona empleadoActualizado = null;
		oEmpleado.get().setNombre(empleado.getNombre());
		oEmpleado.get().setApellido(empleado.getApellido());
		oEmpleado.get().setDireccion(empleado.getDireccion());
		empleadoActualizado = repository.save(oEmpleado.get());

		return empleadoActualizado;
	}

}
