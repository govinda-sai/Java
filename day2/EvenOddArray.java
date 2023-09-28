package day2;

import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int[] arr = new int[10];
	
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}