package com.ibm.academiatoledo.restapi.universidad.servicios;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;

public interface ProfesorDAO extends PersonaDAO
{
	public Iterable<Persona>findProfesoresByNombreCarrera(String nombreCarrera);

}
