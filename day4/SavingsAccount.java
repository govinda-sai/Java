package day4;

public class SavingsAccount {
	private int accNo;
	private String name;
	private double currentBal;
	private static double minBal;

	public SavingsAccount() {
	}

	public SavingsAccount(int accNo, String name, double currentBal) {
		this.accNo = accNo;
		this.name = name;
		this.currentBal = currentBal;
	}

	public SavingsAccount(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}

	// methods
	public void deposit(double money) {
		this.currentBal = this.currentBal + money;
	}

	public void withdraw(double money) {
		if (this.currentBal - SavingsAccount.getMinBal() < money) {
			System.out.println("Insufficient Balance");
		}
		this.currentBal = this.currentBal - money;
	}

	public double getBalance() {
		return this.currentBal;
	}

	// minimum balance
	public static void setMinBal(double minBal) {
		SavingsAccount.minBal = minBal;
	}

	public static double getMinBal() {
		return minBal;
	}

	// setters
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}

	// getters
	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getCurrentBal() {
		return currentBal;
	}

	public void print() {
		System.out.println("Account no.: " + this.accNo + "\nAccount Holder Name: " + this.name + "\nCurrent Balance: "
				+ this.currentBal + "\nMinimum Balance: " + SavingsAccount.getMinBal());
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof SavingsAccount) {
			SavingsAccount sa = (SavingsAccount) o;
			return this.accNo == sa.accNo && this.name.equals(sa.name) &&
					this.currentBal == sa.currentBal;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.accNo;
	}
	
	@Override
	public String toString() {
		return "Account no.: " + this.accNo + "\nAccount Holder Name: " + this.name + "\nCurrent Balance: "
				+ this.currentBal + "\nMinimum Balance: " + SavingsAccount.getMinBal();
	}
}
