package com.ibm.academiatoledo.restapi.universidad;

//import java.util.List;
//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academiatoledo.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academiatoledo.restapi.universidad.servicios.AlumnoDAO;
import com.ibm.academiatoledo.restapi.universidad.servicios.CarreraDAO;*/

@Component
public class TestUniversidad implements CommandLineRunner
{

	/*@Autowired						
	private CarreraDAO carreraDao;
	
	@Autowired
	private AlumnoDAO alumnoDao;*/
	
	@Override
	public void run(String... args) throws Exception
	{
		
		//TODO INSERT		
		/*Carrera ingenieriaSistemas = new Carrera(null, "sistemas", 60, 5, "jtoledo");
		Carrera carrera = carreraDao.guardar(ingenieriaSistemas);
		System.out.println(carrera.toString());*/
		
		/*Direccion direccionAlumno = new Direccion("Calle falsa", "11", "2235", "1506", "15", "Prueba2");
		Persona alumno = new Alumno(null, "Juanito", "Martinez", "123456740", "jM", direccionAlumno);
		Persona personaAlumno = alumnoDao.guardar(alumno);
		System.out.println(personaAlumno.toString());
		
		//TODO CONSULTA
		List<Persona> alumnos = (List<Persona>) alumnoDao.buscarTodos();
		alumnos.forEach(System.out::println);*/
		
		//Carrera carrera = null; 
		
		/*Carrera carrera = new Carrera(null, "Inglees", 60, 5, "jtoledo");
		
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(8L);
		
		if(oCarrera.isPresent())
		{
			carrera = oCarrera.get();
			System.out.println(oCarrera.toString());
		}
		else
		{
			System.out.println("Carrera no se encuentra");
		}
		
		//TODO UPDATE
		carrera.setCantidadAnios(3);
		carrera.setCantidadMaterias(10);
		carreraDao.guardar(carrera);
		
		System.out.println("Carrera Actualizada: " + carreraDao.buscarPorId(1L).orElse(new Carrera()).toString());
		
		//TODO UPDATE
		carreraDao.eliminarPorId(2L);
		System.out.println("Eliminado");*/
		
	}
}