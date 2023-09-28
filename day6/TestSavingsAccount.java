package day6;

public class TestSavingsAccount {
	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount(123456789, "Govind", 20000);
		SavingsAccount sa2 = new SavingsAccount(123456789, "Govind", 20000);
		sa1.withdraw(26000);
		SavingsAccount.setMinBal(500);
		sa1.print();
		
		System.out.println(sa1);
		System.out.println("hashcode: " + sa1.hashCode());
		System.out.println(sa1.equals(sa2));
	}
}