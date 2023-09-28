package day7;

import java.util.Scanner;

public class NumbersTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String num = sc.nextLine();
		String[] n = num.split(",");
		
		int total = 0;
		for(String i : n) {
			total = total + Integer.parseInt(i);
		}
		System.out.println(total);
		sc.close();
	}
}