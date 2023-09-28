package day7;

import java.util.Scanner;
import java.util.StringJoiner;

public class AcceptUntilEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringJoiner sj = new StringJoiner("-");
		do {
			sj.add(sc.nextLine());
		} while(!(sc.nextLine().equalsIgnoreCase("end")));
		System.out.println(sj);
		sc.close();
	}
}