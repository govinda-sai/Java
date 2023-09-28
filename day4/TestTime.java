package day4;

public class TestTime {
	public static void main(String[] args) {
		Time time1 = new Time(1, 30, 50);
		Time time2 = new Time(1, 30);
		Time time3 = new Time(1);
		time1.print();
		time2.print();
		time3.print();
		System.out.println(time1.getTotalSeconds());
		System.out.println(time2.getTotalSeconds());
		System.out.println(time3.getTotalSeconds());
	}
}