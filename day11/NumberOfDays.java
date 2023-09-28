package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {
	public static void main(String[] args) throws IOException {
		var fr = new FileReader("D:\\Java_Imaginnovate\\Java\\src\\day11\\tasks.txt");
		var br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String[] arr = line.split(" ");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			var start = LocalDate.parse(arr[arr.length - 2], dtf);
			var end = LocalDate.parse(arr[arr.length - 1], dtf);
			long days = ChronoUnit.DAYS.between(start, end);
			System.out.println(days);
		}
		br.close();
	}
}