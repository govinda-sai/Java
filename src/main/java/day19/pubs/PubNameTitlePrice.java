package day19.pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PubNameTitlePrice {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var titles = em.createQuery("from day19.pubs.Publishers", Publishers.class);
		var publishersList = titles.getResultList();
		
        for(var p : publishersList) {
//        	System.out.printf("%-20s ", p.getPubName());
//        	System.out.println("-".repeat(100));
        	for(var t : p.getTitlesList()) {
        		System.out.printf("%-23s %-65s %-9.2f\n", p.getPubName(), t.getName(), t.getPrice());
        	}
        }
		em.close();
		emf.close();
	}
}	