package day4;

public class GCD {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No numbers entered");
		} else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			System.out.println("GCD: " + a);
		}
	}
}