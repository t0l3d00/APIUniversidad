package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;

public interface PersonaDAO extends GenericoDAO<Persona>
{
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
	public Optional<Persona> buscarPorDni(String dni);
	public Iterable<Persona> buscarPorApellido(String apellido);
}
