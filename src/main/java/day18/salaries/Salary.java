package day18.salaries;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table (name = "cpk_salaries")
@Entity (name = "day18.salaries.Salary")
public class Salary {
	@EmbeddedId 
	private SalaryPK key;
	
	@Column (name = "salary", length = 10)
	private double salary;
	
	public void setKey(SalaryPK key) {
		this.key = key;
	}
	public SalaryPK getKey() {
		return this.key;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}	