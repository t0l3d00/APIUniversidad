package com.ibm.academiatoledo.restapi.universidad.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;

public interface AulaRepository extends CrudRepository<Aula, Long>
{

	public Iterable<Aula> findAulaByTipoPizarronContains(TipoPizarron tipoPizarron);
	public Iterable<Aula> findAulaByPabellonContains(Pabellon pabellon);
	public Iterable<Aula> findAulaBynumeroAulaContains(Integer numeroAula);

}
