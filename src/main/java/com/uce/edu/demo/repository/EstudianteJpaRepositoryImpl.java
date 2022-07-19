package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorSencilla;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public Estudiante buscarPorCedulaType(String cedula) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e where e.cedula = :datoCedula", Estudiante.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e where e.nombre = :datoNombre AND e.apellido = :datoApellido", Estudiante.class);
		myTypedQuery.setParameter("datoNombre ", nombre);
		myTypedQuery.setParameter("datoApellido ", apellido);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdadNamed(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorEdad");
		myQuery.setParameter("datoEdad", edad);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreConANamed(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreConA");
		myQuery.setParameter("datoNombre", nombre);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorCedulaNamedTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCedula", Estudiante.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamedType(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getResultList();
	}
	
	//NATIVE QUERY
	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE cedula = :datoCedula ", Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorEdadNative(Integer edad) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE edad = :datoEdad ", Estudiante.class);
		myQuery.setParameter("datoEdad", edad);
		return (List<Estudiante>) myQuery.getResultList();
	}
	
		//NAAMED NATIVE QUERY 
	@Override
	public List<Estudiante>  buscarPorNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellidoNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorIddNative(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorIdNative", Estudiante.class);
		myQuery.setParameter("datoId", id);
		return myQuery.getSingleResult();
	}

	//Criteria API
	@Override
	public List<Estudiante> buscarPorDinamicamentePredicadosEdadCriteriaApi(String nombre, String apellido, Integer edad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

        Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

        Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
        Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
        Predicate predicadoEdad = myCriteria.equal(myTabla.get("edad"), edad);

        Predicate miPredicadoFinal = null;

        //AND Y OR EN UNA MISMA SENTENCIA sql
        if (edad>15) {
            miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoEdad);
            
        } else  {
        	miPredicadoFinal = myCriteria.and(predicadoApellido, predicadoEdad);
        }

        myQuery.select(myTabla).where(miPredicadoFinal);
        TypedQuery<Estudiante> myQueryFinal = this.entityManager
                .createQuery(myQuery);

        return myQueryFinal.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorDinamicamentePredicadosOrdenadoCriteriaApi(String nombre, String apellido,
			Integer id, int edad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

        Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

        Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
        Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
        Predicate predicadoId = myCriteria.equal(myTabla.get("edad"), id);
        Predicate predicadoEdad = myCriteria.equal(myTabla.get("edad"), edad);

        Predicate miPredicadoFinal = null;
        int comparacion = 15;

        //AND Y OR EN UNA MISMA SENTENCIA sql
        if (edad>11) {
            miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoEdad);
            
        } else if(edad <20) {
        	miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
        	 myCriteria.and(miPredicadoFinal,predicadoEdad);
        	
        }

        myQuery.select(myTabla).where(miPredicadoFinal);
        TypedQuery<Estudiante> myQueryFinal = this.entityManager
                .createQuery(myQuery);

        return myQueryFinal.getResultList();
	}

	@Override
	public List<EstudianteSencillo> buscarPorApellidoSencillos(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteSencillo> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.EstudianteSencillo(e.nombre, e.apellido, e.edad) FROM Estudiante e WHERE e.apellido = :datoApellido GROUP BY (e.nombre, e.apellido, e.edad) ORDER BY e.nombre",EstudianteSencillo.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<EstudianteContadorSencilla> consultarCantidadPorGenero() {
		// TODO Auto-generated method stub
		//select genero, count (genero) from estudiante where edad>19 group by genero
		//select pers_genero, count (pers_genero) from persona group by pers_genero
		//select NEW PersonaContadorGenero (p.genero, count(p.genero)) from Persona p group by p.genero
		TypedQuery<EstudianteContadorSencilla> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.EstudianteContadorSencilla(e.genero, COUNT(e.genero)) FROM Estudiante e  GROUP BY e.genero ", EstudianteContadorSencilla.class);
		
		return myQuery.getResultList();
	}

}
