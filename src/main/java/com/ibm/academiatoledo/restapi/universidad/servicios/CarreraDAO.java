package com.ibm.academiatoledo.restapi.universidad.servicios;




import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Carrera;


public interface CarreraDAO extends GenericoDAO<Carrera> 
{
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
	public Iterable<Carrera> findCarrerasByProfesorNombreYApellido(String nombre, String apellido); 
	public Carrera actualizar(Long carreraId, Carrera carrera);
}
