//Factors of a number 

package day1;

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int flag = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
				flag = 1;
			} 
		}
		if(flag != 1)
		{
			System.out.println("No factors for the entered number");
		}
		sc.close();
	}
}