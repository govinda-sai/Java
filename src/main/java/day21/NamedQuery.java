package day21;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NamedQuery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		var namedQueryList = em.createNamedQuery("costly_products").getResultList();
		
		for(var v : namedQueryList) {
			System.out.print(v.toString() + "\n");
		}
		em.close();
		emf.close();
	}
}	