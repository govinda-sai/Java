package day2;

import java.util.Scanner;

public class DivisibleByAllElements {
	public static boolean isDivisible(int ... arr) {
		int divisor = arr[0];

		for(int n : arr) {
			if(n % divisor != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(isDivisible(arr));
		sc.close();
	}
}