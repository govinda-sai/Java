package day3.oops;

import java.lang.Math;

public class Circle {
	private double x;
	private double y;
	private double radius;
	
	public Circle(){}
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	public void print() {
		System.out.println("x co-ordinate: " + x + "\ny co-ordinate: " + y + "\nradius: " + radius);
	}
	
	public String toString() {
		return "x: " + this.x + "\ny: " + this.y + "\nradius: " + this.radius;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle circle = (Circle) o;
			return this.x == circle.x && this.y == circle.y && this.radius == circle.radius;
		}
		return false;
	}
	
	public int hasCode() {
		return (int)this.x;
	}
}