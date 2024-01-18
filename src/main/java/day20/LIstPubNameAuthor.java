package day20;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Persistence;

public class LIstPubNameAuthor {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		
		var publisher = em.createQuery("from day20.Publisher", Publisher.class);
		var publisherList = publisher.getResultList();
		
		for(var pl : publisherList) {
			for(var t : pl.getTitlesList()) {
				for(var a : t.getAuthorsList()) {
					System.out.printf("%-25s %-4s %-2s\n", pl.getPubName(), 
							a.getFname(), a.getLname());
				}
			}
		}
		
//		var authors = em.createQuery("from day20.Author", Author.class);
//		var authorsList = authors.getResultList();
		
//		for(var v : authorsList) {
//			for(var t : v.getTitles()) {
//				System.out.printf("%-25s %-4s %-2s\n", t.getPublisher().getPubName(), 
//						v.getFname(), v.getLname());
//			}
//		}
		
		em.close();
		emf.close();
	}
}