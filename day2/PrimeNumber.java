package day2;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		int flag = 0;
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				flag++;
			}
		}
		return flag == 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n = sc.nextInt();
		
		System.out.println(isPrime(n));
		sc.close();
	}
}