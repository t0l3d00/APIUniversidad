package com.ibm.academiatoledo.restapi.universidad.servicios;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academiatoledo.restapi.universidad.repositorios.AulaRepository;
import com.ibm.academiatoledo.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academiatoledo.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Pabellon;


@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository>implements AulaDAO
{
	
	
	 @Autowired
		public AulaDAOImpl(AulaRepository repository) 
	    {
			super(repository);
			
		}
	 @Override
	 @Transactional()
		public Iterable<Aula> findAulaByTipoPizarronContains(TipoPizarron tipoPizarron) 
	    {
		 return repository.findAulaByTipoPizarronContains(tipoPizarron);
		}

		

		@Override
		@Transactional(readOnly = true)
		public Iterable<Aula> findAulaByPabellonContains(Pabellon pabellon) 
		{
			
			return repository.findAulaByPabellonContains(pabellon);
		}

		@Override
		@Transactional(readOnly = true)
		public Iterable<Aula> findAulaBynumeroAulaContains(Integer numeroAula) 
		{
			
			return repository.findAulaBynumeroAulaContains(numeroAula);
		}

		@Override
		public Aula actualizar(Long aulaId, Aula aula) 
		{
			Optional<Aula> oAula = repository.findById(aulaId);

			if(!oAula.isPresent())
				throw new NotFoundException(String.format("El aula con ID %d no existe", aulaId));

			Aula aulaActualizada = null;
			oAula.get().setCantidadPupitres(aula.getCantidadPupitres());
			oAula.get().setTipoPizarron(aula.getTipoPizarron());
			aulaActualizada = repository.save(oAula.get());
			return aulaActualizada;
		}

		

}
