package day7;

import java.util.Scanner;

public class InvertCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = "Govind";
		String s = sc.nextLine();
		char[] charArr = s.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 'a' && charArr[i] <= 'z') {
				charArr[i] = (char) (charArr[i] - 32);
			} else if(charArr[i] >= 'A' && charArr[i] <= 'Z') {
				charArr[i] = (char) (charArr[i] + 32);
			}
		}
		System.out.print(charArr);
		sc.close();
	}
}