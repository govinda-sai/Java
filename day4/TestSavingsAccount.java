package day4;

public class TestSavingsAccount {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(123456789, "Govind", 20000);
		sa.withdraw(26000);
		SavingsAccount.setMinBal(500);
		sa.print();
	}
}