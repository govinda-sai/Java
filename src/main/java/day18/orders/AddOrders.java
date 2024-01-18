package day18.orders;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddOrders {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		Order o = new Order();
		o.setName("Ye");
		o.getProductDetails().add(new ProductDetailsCollection(40, 6));
		
		
//		o.setName("Kanye");
//		o.setDate("2023-08-15");
//		o.getIds().add(1);
//		o.getIds().add(2);
		
//		o.setName("Travis");
//		o.setDate("2023-09-22");
//		o.getIds().add(11);
//		o.getIds().add(22);
		
//		Order o2 = new Order();
//		o2.setName("Travis");
//		o2.setDate("2023-09-23");
//		o2.getIds().add(11);
//		o2.getIds().add(22);
		
//		ProductDetailsCollection pdc = new ProductDetailsCollection();
//		pdc.setProductId(101);
//		pdc.setQuantity(17);
		
//		o.setPdc(pdc);
		
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
