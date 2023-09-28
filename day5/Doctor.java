package day5;

class Doctor {
	private String name;
	private String mobileNo;
	private String department;
	private double salary;
	
	public Doctor(){}
	public Doctor(String name, String mobileNo, String department, double salary) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.department = department;
		this.salary = salary;
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
	public void setSalary(double salary) {
		this.salary = salary;
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
	
	public double getSalary() {
		return this.salary;
	}
	public void print() {
		System.out.print("Doctor Name: " + this.name 
							+ "\nMobile Number: " + this.mobileNo 
							+ "\nDepartment: " + this.department 
							+ "\nSalary: " + this.salary + "\n");
	}
}

class ResidentalDoctor extends Doctor {
	
	public ResidentalDoctor() {}
	public ResidentalDoctor(String name, String mobileNo, String department, double salary) {
		super(name, mobileNo, department, salary);
	}
	
	@Override 
	public double getSalary() {
		return super.getSalary();
	}
	@Override
	public void print() {
		super.print();
	}
}

class Consultant extends Doctor {
	private int visits;
	private double charge;
	
	Consultant(){}
	public Consultant(String name, String mobileNo, String department, double salary,
					int visits, double charge) {
		super(name, mobileNo, department, visits * charge);
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
}

class ConsultingSurgeons extends Consultant {
	private int surgeries;
	
	public ConsultingSurgeons() {}
	public ConsultingSurgeons(String name, String mobileNo, String department, double salary, 
								int visits, double charge, int surgeries) {
		super(name, mobileNo, department, visits * charge, visits, charge);
		this.surgeries = surgeries;
	}
	
	//setter and getter
	public void setSurgeries(int surgeries) {
		this.surgeries = surgeries;
	}
	public int getSurgeries() {
		return this.surgeries;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + (super.getCharge() * this.surgeries);
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Number of Surgeries: " + this.surgeries);
	}
}