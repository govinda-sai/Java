package day20.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity (name = "day20.inheritance.Consultant")
@DiscriminatorValue(value = "con")
public class Consultant extends Doctor {
	@Column (name = "visits")
	private Integer visits;
	
	@Column (name = "charge")
	private Double charge;

	public Integer getVisits() {
		return visits;
	}

	public void setVisits(Integer visits) {
		this.visits = visits;
	}

	public Double getCharge() {
		return charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "Id()=" + getId() + ", Name()=" + getName() + 
				", MobileNo()=" + getMobileNo() + 
				", Department()=" + getDepartment() +
				", Salary()=" + getSalary() + 
				", Visits=" + this.visits + ", Charge=" + this.charge;
	}
}