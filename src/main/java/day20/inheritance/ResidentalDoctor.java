package day20.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity (name = "day20.inheritance.ResidentalDoctor")
@DiscriminatorValue(value = "rd")
public class ResidentalDoctor extends Doctor {

	@Override
	public String toString() {
		return "Id()=" + getId() + ", Name()=" + getName() 
		+ ", MobileNo()=" + getMobileNo()
		+ ", Department()=" + getDepartment() 
		+ ", Salary()=" + getSalary();
	}
}