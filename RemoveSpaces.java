package day13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpaces {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("/home/govindasai/eclipse-workspace/Java/src/day13/text_spaces.txt");
		var text = Files.readAllLines(path);
		Pattern pattern = Pattern.compile(" +");
		var fw = new FileWriter("/home/govindasai/eclipse-workspace/Java/src/day13/text_spaces.txt");
		var bw = new BufferedWriter(fw);
		
		for(var v : text) {
			Matcher matcher = pattern.matcher(v);
			String output = matcher.replaceAll(" ");
			fw.write(output + "\n");
		}
		bw.close();
	}
}