package day5;

class TestDoctor {
	public static void main(String[] args) {
		ResidentalDoctor rd = new ResidentalDoctor();
		rd.setName("Sai");
		rd.setDepartment("Neurologist");
		rd.setMobileNo("9182023224");
		rd.setSalary(50000);
		rd.print();
		System.out.println();
		
		Consultant c = new Consultant();
		c = new Consultant("Satish", "6182023214", "Cardiologist", c.getSalary(), 10, 1000);
		c.print();
		System.out.println();
		
		
		ConsultingSurgeons cs = new ConsultingSurgeons();
		cs = new ConsultingSurgeons("Lohit", "8281923112", "General Doctor", cs.getSalary(), 
										10, 1000, 20);
		cs.print();
	}
}