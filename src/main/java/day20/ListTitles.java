package day20;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var titles = em.createQuery("from day20.Title as t join fetch t.publisher", Title.class);
		var titlesList = titles.getResultList();
		
		for(var t : titlesList) {
			for(var a : t.getAuthorsList()) {
				System.out.printf("%-10s %-22s %-75s %-10s\n", 
						t.getPublisher().getPubId(), t.getPublisher().getPubName(),
						t.getName(), a.getFname());
			}
		}
		
		em.close();
		emf.close();
	}
}