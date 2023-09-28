package day6;

import java.util.Scanner;

public class ConsecutiveSpaces {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
//		String s = "This  is   fine";
				
		int flag = 0;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ' && s.charAt(i - 1) != ' ') {
				System.out.print(i + " ");
				flag = 1;
			}
		}
		if(flag != 1) {
			System.out.println("There are no consecutive spaces.");
		}
		sc.close();
	}
}