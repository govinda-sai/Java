package day6;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(0, 0, 5);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		circle.print();
		
		System.out.println(circle);
		System.out.println(circle.hasCode());
	}
}