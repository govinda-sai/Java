package day21;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
//		var products = em.createQuery("from day21.Product", Product.class).getResultList();
		var products = em.createQuery
				("select p.prodname, p.price from day21.Product as p where p.prodname Like '%HP%'");
		var productsList = products.getResultList();
		
		for(var v : productsList) {
			if(v instanceof Object[]) {
				for(var p : (Object[]) v) {
					System.out.print(p == null ? " " : p.toString() + " ");
				}
				System.out.println();
			} else {
				System.out.println(v.toString());
			}
		}
		
//		for (var obj : productsList) {
//		    if (obj instanceof Object[]) {
//		        Object[] row = (Object[]) obj;
//		        String prodname = (String) row[0];
//		        Double price = (Double) row[1];
//		        System.out.printf("%s : %.2f\n", prodname, price);
//		    } else {
//		        System.out.println(obj.toString());
//		    }
//		}
		
		em.close();
		emf.close();
	}
}