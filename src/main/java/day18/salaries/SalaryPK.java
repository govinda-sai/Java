package day18.salaries;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalaryPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column (name = "emp_id") 
	private int emp_id;
	@Column (name = "month", length = 15)
	private String month;
	
	public void setEmpId(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getMonth() {
		return month;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(emp_id, month);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryPK other = (SalaryPK) obj;
		return emp_id == other.emp_id && Objects.equals(month, other.month);
	}
}