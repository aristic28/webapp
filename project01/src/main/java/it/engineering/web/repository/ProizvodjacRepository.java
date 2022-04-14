package it.engineering.web.repository;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.model.Proizvodjac;
import it.engineering.web.persistence.MyEntityManagerFactory;

public class ProizvodjacRepository {
	public List<Proizvodjac> getAll(){
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory()
				.createEntityManager();
	
		List<Proizvodjac> manufactures = em
				.createQuery("select m from Manufacturer m",Proizvodjac.class)
				.getResultList();
			
		em.close();
		return manufactures;
	}
}
