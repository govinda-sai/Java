package day18.house;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Parking {
	@Column (name = "parking_code")
	private String parkingCode;
	
	@Embedded 
	private ParkingSize parkingSize;

	public String getParkingCode() {
		return parkingCode;
	}

	public void setParkingCode(String parkingCode) {
		this.parkingCode = parkingCode;
	}

	public ParkingSize getParkingSize() {
		return parkingSize;
	}

	public void setParkingSize(ParkingSize parkingSize) {
		this.parkingSize = parkingSize;
	}
}