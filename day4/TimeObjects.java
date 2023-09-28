package day4;

public class TimeObjects {
	public static void main(String[] args) {
		Time[] t = new Time[5];
		for(int i = 0; i < t.length; i++) {
			t[i] = new Time((int)(Math.random() * 24), 
							(int)(Math.random() * 60), 
							(int)(Math.random() * 60));
			t[i].print();
		}
	}
}