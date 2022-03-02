package com.ibm.academiatoledo.restapi.universidad.servicios;

import java.util.Optional;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Carrera;

public interface GenericoDAO<E>
{
	public Optional<Carrera> buscarPorId(Long id);
	public E  guardar (E entidad);
	public Iterable<E> buscarTodos();
	public void eliminarPorId(Long id);

}
