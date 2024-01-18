package day19.pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TitlesPrice {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var titles = em.createQuery("from day19.pubs.Titles", Titles.class);
		var titlesList = titles.getResultList();

		for(var v : titlesList) {
			System.out.printf("%s \t %-65s %-7.2f\n", 
				v.getTitle_id(), v.getName(), v.getPrice());
		}
		em.close();
		emf.close();
	}
}	