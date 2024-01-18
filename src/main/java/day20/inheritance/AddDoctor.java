package day20.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddDoctor {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
//		Doctor doctor = new Doctor();
		
		ResidentalDoctor rd = new ResidentalDoctor();
		rd.setName("Kanye");
		rd.setMobileNo("9138323233");
		rd.setDepartment("cardiologist");
		rd.setSalary(200000.0);
		
		Consultant c = new Consultant();
		c.setName("Travis");
		c.setMobileNo("8123023113");
		c.setDepartment("neurologist");
		c.setVisits(1);
		c.setCharge(50000.0);
		c.setSalary(c.getVisits() * c.getCharge());
		
		em.getTransaction().begin();
		em.persist(rd);
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}