package day4;

public class Table {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No numbers entered");
		} else {
			if (args.length == 1) {
				int table = Integer.parseInt(args[0]);
				for (int i = 1; i <= 10; i++) {
					System.out.println(table + " x " + i + " = " + table * i);
				}
			} else {
				int table = Integer.parseInt(args[0]);
				int n = Integer.parseInt(args[1]);
				for (int i = 1; i <= n; i++) {
					System.out.println(table + " x " + i + " = " + table * i);
				}
			}
		}
	}
}