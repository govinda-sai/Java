package day2;

import java.util.Scanner;

public class MismatchedIndexes {
	public static int mismatchedIndex(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return -1;
		} else {
			for(int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		System.out.println("Enter array 1 elements: ");
		for(int i = 0; i < 5; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter array 2 elements: ");
		for(int i = 0; i < 5; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Mismatched index: " + mismatchedIndex(arr1, arr2));
		
		sc.close();
	}
}