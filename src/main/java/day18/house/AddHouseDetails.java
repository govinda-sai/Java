package day18.house;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddHouseDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		ParkingSize ps = new ParkingSize();
		ps.setLength(500);
		ps.setWidth(600);
		
		Parking p = new Parking();
		p.setParkingCode("pa");
		p.setParkingSize(ps);
		
		House house = new House();
//		house.setId(101);
		house.setOwnerName("Kanye");
		house.setType("None");
		house.setParkingDetails(p);
		
		em.getTransaction().begin();
		em.persist(house);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}	