package day19;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager(); 
		
		var productSales = em.createQuery("from day19.Product", Product.class);
		var result = productSales.getResultList();
		
		for(var v : result) {
			System.out.printf("%d \t %-30s %-8.2f \t %d \t %-20s \t %s\n", 
					v.getProdid(), v.getProdname(), v.getPrice(), v.getQoh(), v.getRemarks(), v.getCatcode());
		}
		em.close();
		emf.close();
	}
}