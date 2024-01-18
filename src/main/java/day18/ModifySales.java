package day18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ModifySales {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		Sales sales = new Sales(); //transient state
		sales.setProdid(103);
		sales.setTransdate("2022-08-15 00:00:00.0");
		sales.setQty(3);
		sales.setAmount(10000);
		
		em.getTransaction().begin();
		em.persist(sales);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}	