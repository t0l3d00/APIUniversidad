package com.ibm.academiatoledo.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository
{
	@Query("select a from Profesor a where a.carrera.nombre = ?1")
	public Iterable<Persona> findProfesoresByNombreCarrera (String carrera);

}
