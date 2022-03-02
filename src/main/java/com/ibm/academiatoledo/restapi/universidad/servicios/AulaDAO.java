package com.ibm.academiatoledo.restapi.universidad.servicios;

import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;

public interface AulaDAO extends GenericoDAO<Aula>
{
public Iterable<Aula> findAulaByTipoPizarronContains(TipoPizarron tipoPizarron);
	
	public Iterable<Aula> findAulaByPabellonContains(Pabellon pabellon);
	
	public Iterable<Aula> findAulaBynumeroAulaContains(Integer numeroAula);

	public Aula actualizar(Long aulaId, Aula aula);
}
