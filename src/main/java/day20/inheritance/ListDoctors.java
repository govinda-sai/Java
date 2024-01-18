package day20.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListDoctors {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		var doctors = em.createQuery("from day20.inheritance.Doctor", Doctor.class);
		var doctorsList = doctors.getResultList();

		
		for(var d : doctorsList) {
			System.out.printf("%s\n", d.toString());
		}
		
		em.close();
		emf.close();
	}
}