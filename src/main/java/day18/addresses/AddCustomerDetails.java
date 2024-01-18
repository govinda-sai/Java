package day18.addresses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomerDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		Customer c = new Customer();
		c.setName("Kanye");
		
		Address a = new Address();
		a. setAddress("Waltair");
		a.setCity("Vizag");
		c.setOffice(a);
		c.setMobile("9182233221");
		c.setEmail("kanye@gmail.com");
//		var found = em.find(Customer.class, 3);
		
		em.getTransaction().begin();
		em.persist(c);
//		em.remove(found);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}