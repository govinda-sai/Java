package day17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		var products = em.createQuery("from day17.Product", Product.class);
		var productsList = products.getResultList();
		
		for(var v : productsList) {
			System.out.println(v);
		}
		
		em.close();
		emf.close();
	}
}