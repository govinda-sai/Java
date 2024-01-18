package day18.salaries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		Employee e1 = new Employee();
		e1.setName("Kanye");
		Employee e2 = new Employee();
		e2.setName("Travis");
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.getTransaction().commit();
		
//		var found = em.find(Employee.class, 3); 
//		em.getTransaction().begin();
//		em.remove(found);
//		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}