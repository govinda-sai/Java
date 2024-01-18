package day19.pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TitlePricePubName {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var titles = em.createQuery("from day19.pubs.Titles", Titles.class);
		var titlesList = titles.getResultList();

		for(var v : titlesList) {
			System.out.printf("%-66s %-9.2f %-30s \n", 
				v.getName(),v.getPrice(), v.getPublishers().getPubName());
		}
		em.close();
		emf.close();
	}
}	