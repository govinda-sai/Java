package day18.house;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "house")
@Entity (name = "day18.house.House")
public class House {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private int id;
	
	@Column (name = "owner_name")
	private String ownerName;
	
	@Column (name = "type")
	private String type;
	
	@Embedded 
	private Parking parkingDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Parking getParkingDetails() {
		return parkingDetails;
	}

	public void setParkingDetails(Parking parkingDetails) {
		this.parkingDetails = parkingDetails;
	}
}	