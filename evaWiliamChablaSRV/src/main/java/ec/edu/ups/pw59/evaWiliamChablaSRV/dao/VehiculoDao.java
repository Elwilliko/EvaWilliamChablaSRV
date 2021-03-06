package ec.edu.ups.pw59.evaWiliamChablaSRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw59.evaWiliamChablaSRV.modelo.Vehiculo;


@Stateless
public class VehiculoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo op) {
		em.persist(op);
		
	}
	
	public void update(Vehiculo op) {
			em.merge(op);
		}
	
	public Vehiculo read(String id) {
		Vehiculo op = em.find(Vehiculo.class, id);
		return op;
	}
	
	public void delete(int id) {
		Vehiculo op = em.find(Vehiculo.class, id);
		em.remove(op);
	}
	
	public List<Vehiculo> getList(){
		List<Vehiculo> listado = new ArrayList<Vehiculo>();
		
		String jpql = "SELECT op FROM Vehiculo op";
				
		
		Query query = em.createQuery(jpql, Vehiculo.class);
		
		listado = query.getResultList();
		
		return listado;
		
		//JSPQL -> SQL
		
	}



}
