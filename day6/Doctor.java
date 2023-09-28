 package day6;

abstract class Doctor {
	private String name;
	private String mobileNo;
	private String department;
	
	public Doctor(){}
	public Doctor(String name, String mobileNo, String department) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.department = department;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	public String getMobileNo() {
		return this.mobileNo;
	}
	public String getDepartment() {
		return this.department;
	}
	
	//abstract method
	public abstract double getSalary();
	public void print() {
		System.out.print("Doctor Name: " + this.name 
							+ "\nMobile Number: " + this.mobileNo 
							+ "\nDepartment: " + this.department + "\n");
	}
}

class ResidentalDoctor extends Doctor {
	private double salary;
	
	public ResidentalDoctor() {}
	public ResidentalDoctor(String name, String mobileNo, String department, double salary) {
		super(name, mobileNo, department);
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override 
	public double getSalary() {
		return this.salary;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Salary: " + this.salary);
	}
	
//	@Override 
//	public boolean equals(Object o) {
//		if(o instanceof ResidentalDoctor) {
//			ResidentalDoctor r = (ResidentalDoctor) o;
//			return this.salary == r.salary;
//		}
//		return false;
//	}
//	
//	@Override 
//	public int hashCode() {
//		return (int) this.salary;
//	}
//	
//	@Override 
//	public String toString() {
//		return "Doctor Name: " + super.getName() 
//				+ "\nMobile Number: " + super.getMobileNo() 
//				+ "\nDepartment: " + super.getDepartment()
//				+ "\nSalary: " + this.salary;
//	}
}

class Consultant extends Doctor {
	private int visits;
	private double charge;
	
	Consultant(){}
	public Consultant(String name, String mobileNo, String department,
					int visits, double charge) {
		super(name, mobileNo, department);
		this.visits = visits;
		this.charge = charge;
	}
	
	//setters
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	//getters
	public int getVisits() {
		return visits;
	}
	public double getCharge() {
		return charge;
	}
	
	@Override
	public double getSalary() {
		return this.charge * this.visits;
	}
	@Override 
	public void print() {
		super.print();
		System.out.println("Number of visits: " + this.visits + "\nCharge: " + this.charge);
	}
	
//	@Override 
//	public String toString() {
//		return "Doctor Name: " + super.getName() 
//				+ "\nMobile Number: " + super.getMobileNo() 
//				+ "\nDepartment: " + super.getDepartment()
//				+ "\nVisit: " + this.visits + "\nCharge: " + this.charge + "\n";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(charge, visits);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Consultant) {
//			Consultant c = (Consultant) obj;
//			return c.visits == this.visits && c.charge == this.charge;
//		}
//		return false;
//	}
}

class ConsultingSurgeons extends Consultant {
	private int surgeries;
	private int surgeriesAmount;
	
	public ConsultingSurgeons() {}
	public ConsultingSurgeons(String name, String mobileNo, String department, 
								int visits, double charge,
								int surgeries, int surgeriesAmount) {
		super(name, mobileNo, department, visits, charge);
		this.surgeries = surgeries;
		this.surgeriesAmount = surgeriesAmount;
	}
	
	//setter and getter
	public void setSurgeries(int surgeries) {
		this.surgeriesAmount = surgeries;
	}
	public void setSurgeriesAmount(int surgeriesAmount) {
		this.surgeriesAmount = surgeriesAmount;
	}
	public int getSurgeries() {
		return this.surgeriesAmount;
	}
	public int getSurgeriesAmount() {
		return surgeriesAmount;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + this.surgeries * this.surgeriesAmount;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Number of Surgeries: " + this.surgeriesAmount);
	}
	
//	@Override 
//	public String toString() {
//		return "Doctor Name: " + super.getName() 
//				+ "\nMobile Number: " + super.getMobileNo() 
//				+ "\nDepartment: " + super.getDepartment()
//				+ "\nVisit: " + super.getVisits() + "\nCharge: " + super.getCharge()
//				+ "\nNumber of surgeries: " + this.surgeries + "\nSurgery Amount: " +
//				this.surgeriesAmount + "\n";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result + Objects.hash(surgeries, surgeriesAmount);
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof ConsultingSurgeons) {
//			ConsultingSurgeons cs = (ConsultingSurgeons) obj;
//			return this.surgeries == cs.surgeries && this.surgeriesAmount == cs.surgeriesAmount;
//		}
//		return false;
//	}
}