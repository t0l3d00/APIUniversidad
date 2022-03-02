package com.ibm.academiatoledo.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonRepository extends CrudRepository <Pabellon,Long>
{
	@Query("select p from Pabellon p where p.direccion.localidad = ?1")
	public Iterable<Pabellon> findPabellonByLocalidadContains(String localidad);
	public Iterable<Pabellon> findPabellonByNombreContains(String nombre);
}
