package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListSales {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var sales = em.createQuery("from day18.Sales", Sales.class);
		var salesDetails = sales.getResultList();
		
		for(var v : salesDetails) {
			System.out.printf("%-7d %-10d %-30s %-20d %-8.2f\n",
					v.getId(), v.getProdid(), v.getTransdate(), v.getQty(), v.getAmount());
		}
		em.close();
		emf.close();
	}
}