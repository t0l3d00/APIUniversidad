package com.ibm.academiatoledo.restapi.universidad.servicios;

import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{

	public Iterable<Pabellon>findPabellonByLocalContains(String localidad);
	public Iterable<Pabellon>FindPabellonByNombreContains(String nombre);
}
