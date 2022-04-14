package it.engineering.web.repository;

import javax.persistence.EntityManager;

import it.engineering.web.model.Korisnik;
import it.engineering.web.persistence.MyEntityManagerFactory;

public class KorisnikRepository {

	public Korisnik findByUsername(String username) {
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory()
				.createEntityManager();
		
		
		Korisnik korisnik = em.find(Korisnik.class, username);
		System.out.println(korisnik);
		em.close();
		return korisnik;
	}
	
}
