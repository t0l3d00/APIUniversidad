package com.ibm.academiatoledo.restapi.universidad.servicios;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;

import com.ibm.academiatoledo.restapi.universidad.repositorios.PabellonRepository;



@Service
@Primary
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon,PabellonRepository> implements PabellonDAO
{

	public PabellonDAOImpl(PabellonRepository repository) 
	{
		super(repository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> findPabellonByLocalContains(String localidad)
	{
		
		return repository.findPabellonByLocalidadContains(localidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> FindPabellonByNombreContains(String nombre) 
	{
		
		return repository.findPabellonByNombreContains(nombre);
	}


	

}
