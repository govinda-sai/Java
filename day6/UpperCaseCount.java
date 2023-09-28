package day6;

import java.util.Scanner;

public class UpperCaseCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		int upperCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upperCount++;
			}
		}
		if(upperCount == 0) {
			System.out.println("No upper case letters in the sring.");
		} else {
			System.out.println("Upper case count: " + upperCount);
		}
		sc.close();
	}
}