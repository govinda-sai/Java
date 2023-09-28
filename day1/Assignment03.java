// take 10 numbers from user and display the largest number

package day1;

import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		System.out.println("Enter numbers: ");
		for(int i = 1; i <= 10; i++)
		{
			int num = sc.nextInt();
			if(num > max)
			{
				max = num;
			}
		}
		System.out.println("largest Number: " + max);
		sc.close();
	}
}