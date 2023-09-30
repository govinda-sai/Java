package day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customers {
	public static void main(String[] args) throws IOException {
		Path path = Path.of
						("/home/govindasai/eclipse-workspace/Java/src/day13/customers.txt");
		var customers = Files.readAllLines(path); 
		Pattern name = Pattern.compile("[a-zA-Z]+");
		Pattern number = Pattern.compile("\\d{10}");
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		for(var v : customers) {
			Matcher namesMatch = name.matcher(v);
			Matcher numbersMatch = number.matcher(v);
			
			if(namesMatch.find() && numbersMatch.find()) {
				map.put(namesMatch.group(), numbersMatch.group());
//				System.out.println(namesMatch.group() + " " + numbersMatch.group());
			}
		}
		for(var names : map.keySet()) {
			System.out.println(names + " " + map.get(names));
		}
	}
}