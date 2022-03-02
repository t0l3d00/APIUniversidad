package com.ibm.academiatoledo.restapi.universidad.excepciones;

public class BadRequestException extends RuntimeException
{

	public BadRequestException(String mensaje)
	{
		super(mensaje);
	}
	private static final long serialVersionUID = 1L;

}
