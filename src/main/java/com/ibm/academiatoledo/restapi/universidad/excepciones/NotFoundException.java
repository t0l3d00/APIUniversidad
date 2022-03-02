package com.ibm.academiatoledo.restapi.universidad.excepciones;

public class NotFoundException  extends RuntimeException
{
	public NotFoundException(String mensaje)
	{
		super(mensaje);
	}

	private static final long serialVersionUID = 1L;	
	
}
