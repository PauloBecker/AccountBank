package application;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public  Account() {
		
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		Deposit(initialDeposit);
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getbalance() {
		return balance;
	}


	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit(double deposit) {
		
		 balance += deposit;
	}
	
	public void Withdraw(double withdraw) {
		
		 balance -= withdraw + 5.0;
		
	}
	public String toString() {
		return "Account "
				+ accountHolder
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
