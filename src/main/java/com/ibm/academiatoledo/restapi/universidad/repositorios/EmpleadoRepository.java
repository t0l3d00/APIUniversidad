package com.ibm.academiatoledo.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.NoRepositoryBean;

import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;


@NoRepositoryBean
public interface EmpleadoRepository extends PersonaRepository
{
 
	@Query("select a from Empleado a where a.tipo_empleado = ?1")
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) ;
}
