package day18.house;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ParkingSize {
	@Column (name = "length")
	private double length;
	
	@Column (name = "width")
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}