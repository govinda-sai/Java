package day18.salaries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "cpk_employees")
@Entity (name = "sales.Employee")
public class Employee {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "emp_id")
	private int emp_id;
	@Column (name = "name", length = 30)
	private String name;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}