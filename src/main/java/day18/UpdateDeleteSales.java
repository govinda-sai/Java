package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateDeleteSales {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		Sales sales = new Sales();
		
		//update 
		Sales found = em.find(Sales.class, 6);
		
		if(found != null) {
			em.getTransaction().begin();
//			found.setProdid(110);
			found.setAmount(12000);
			em.getTransaction().commit();
		} else {
			System.out.println("ID not found");
		}
		
		//delete
//		var found = em.find(Sales.class, 7); 
//
//		if(found != null) {
//			em.getTransaction().begin();
//			em.remove(found);
//			em.getTransaction().commit();
//		} else {
//			System.out.println("Invalid ID");
//		} 
		
		em.close();
		emf.close();
	}
}
