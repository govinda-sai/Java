package day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Top3Prices {
	public static void printHighest(String s) {
		String[] sArr = s.split("\n");
		int n = sArr.length;
		for(int i = n-1; i >= 0; i--) {
			System.out.println(sArr[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		Path path = Path.of("/home/govindasai/eclipse-workspace/Java/src/day13/prices.txt");
		Files.lines(path)
			.distinct() 
			.sorted() 
			.forEach(Top3Prices::printHighest);
	}
}	