// Sum of even numbers and odd numbers between 1 and 100

package day1;

public class Assignment01 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("Sum of even elements: " + evenSum);
		System.out.println("Sum of odd elements: " + oddSum);
	}
}