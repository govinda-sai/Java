package day17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		Product products = new Product();
		
		var found = em.find(Product.class, 106);

		if (found != null) {
			em.getTransaction().begin();
			em.remove(found);
			em.getTransaction().commit();
		}
//		products.setProdname("HP Pavilion 15");
//		products.setPrice(48000);
//		products.setRemarks("Laptop");
//		em.getTransaction().begin();
//		em.persist(products);
//		em.getTransaction().commit();
//		var found = em.find(Products.class, 104);
//		if(found != null) {
//			em.getTransaction().begin();
//			em.persist(products);
//			em.remove(found);
//			em.getTransaction().commit();
//		} else {
//			System.out.println("ID not found");
//		}
//		var found = em.find(Products.class, 105);
//		
//		if(found != null) {
//			em.getTransaction().begin();
//			found.setQoh(7);
//			em.getTransaction().commit();
//		}
		emf.close();
		em.close();
	}
}