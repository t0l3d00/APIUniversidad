package com.ibm.academiatoledo.restapi.universidad.servicios;


import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;

public interface EmpleadoDAO extends PersonaDAO
{
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
	public Persona actualizar(Long empleadoId, Persona empleado);
}
