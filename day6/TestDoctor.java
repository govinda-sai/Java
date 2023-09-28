package day6;

class TestDoctor {
	public static void main(String[] args) {
//		ResidentalDoctor rd = new ResidentalDoctor();
//		rd.setName("Sai");
//		rd.setMobileNo("9182023224");
//		rd.setDepartment("Neurologist");
//		rd.setSalary(50000);
////		rd.print();
//		System.out.println(rd);
		
//		Consultant c1 = new Consultant("Sai", "Neurologist", "9182022312", 10, 1000);
//		Consultant c2 = new Consultant("ai", "Neurologist", "9182022312", 10, 1000);
//		System.out.println(c1.equals(c2));
//		Doctor d = new Doctor();
		
		Doctor doctor;
		doctor = new ResidentalDoctor("Sai", "Neurologist", "9182023332", 50000);
		doctor.print();
		System.out.println("Salary: " + doctor.getSalary());
	}
}