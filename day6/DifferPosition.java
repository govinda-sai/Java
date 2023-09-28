package day6;

import java.util.Scanner;

public class DifferPosition {
	public static int position(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
		String s1 = "Govinda Sai";
		String s2 = "Govinda sai";

		System.out.println(position(s1, s2));
		sc.close();
	}
}