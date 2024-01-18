package day19.pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var titles = em.createQuery("from day19.pubs.Titles", Titles.class);
		var titlesList = titles.getResultList();

		for(var v : titlesList) {
			System.out.printf("%s \t %-62s \t %-15s \t %-10d \t %-7.2f \t %-5d \t %-20s \t %s \t %s \t %s\n", 
				v.getTitle_id(), v.getName(), v.getType(), v.getPublishers().getPubId(), v.getPrice(), 
				v.getPublishers().getPubId(), v.getPublishers().getPubName(), v.getPublishers().getCity(), 
				v.getPublishers().getState(), v.getPublishers().getCountry());
		}
		em.close();
		emf.close();
	}
}	