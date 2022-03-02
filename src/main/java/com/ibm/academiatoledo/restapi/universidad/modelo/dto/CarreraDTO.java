package com.ibm.academiatoledo.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CarreraDTO implements Serializable
{
	
	private Long carreraId;
	private String nombre;
	private Integer cantidadMaterias;
	private Integer cantidadAnios;
	private Date fechaCreacion;
	
	private static final long serialVersionUID = 1L;
}
