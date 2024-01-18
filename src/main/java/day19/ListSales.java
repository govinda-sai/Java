package day19;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListSales {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager(); 
		
		var sales = em.createQuery("from day19.Sales", Sales.class);
		var result = sales.getResultList();
		
		for(var v : result) {
			System.out.printf("%d \t %d \t %s \t %d \t %f\n", 
					v.getInvno(), v.getProduct().getProdid(), v.getTransdate(), v.getQty(), v.getAmount());
		}
		em.close();
		emf.close();
	}
}