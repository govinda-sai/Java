
package day21;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPQLQueries {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("Enter query: ");
				String query = sc.nextLine();
				if(query.length() == 0) {
					break;
				} else {
					var list = em.createQuery(query).getResultList();
					for(var v : list) {
						if(v instanceof Object[]) {
							for(var p : (Object[])v) {
								System.out.print(p == null ? " " : p.toString());
							}
							System.out.println();
						} else {
							System.out.println(v.toString());
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		em.close();
		emf.close();
		sc.close();
	}
}