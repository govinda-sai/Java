package practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DTOTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		var query = em.createQuery
				("select new practice.DTO(p.pubname, size(p.titlesList) from practice.Publisher p");
		var list = query.getResultList();
		
		for(var v : list) {
			System.out.println(v);
		}
		em.close();
		emf.close();
	}
}
