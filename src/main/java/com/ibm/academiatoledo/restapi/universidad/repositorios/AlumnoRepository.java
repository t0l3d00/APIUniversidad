package com.ibm.academiatoledo.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioAlumno")
public interface AlumnoRepository extends PersonaRepository
{
	//@Query("select a from Alumno a joint fetch a.carrera c where c.nombre = ?1")
	@Query("select a from Alumno a where a.carrera.nombre = ?1")
	public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}