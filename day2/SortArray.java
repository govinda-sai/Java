package day2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static boolean sortedArray(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(arr);
		return Arrays.equals(arr, temp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sortedArray(arr));
		sc.close();
	}
}