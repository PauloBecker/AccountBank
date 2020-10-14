package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int accountNumber = tc.nextInt();
		System.out.print("Enter account holder: ");
		tc.nextLine();
		String accountHolder = tc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char opcao = tc.next().charAt(0);
		
		if(opcao == 'y') {
		System.out.print("Enter initial deposit value: ");
		double initialDeposit = tc.nextDouble();
	    acc = new Account(accountNumber, accountHolder, initialDeposit);
		}else {
			
			acc = new Account(accountNumber, accountHolder);
		}
		
		System.out.println("=========== Account data ==========");
		System.out.println(acc);
		//System.out.println("Number account: " + acc.getAccountNumber());
		//System.out.println("Holder account: " + acc.getAccountHolder());
		//System.out.println("Balance: R$ " + acc.getbalance());
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = tc.nextDouble();
		acc.Deposit(depositValue);
		
		System.out.println("========== Update account data ======= ");
		System.out.println(acc);
		//System.out.println("Number account: " + acc.getAccountNumber());
		//System.out.println("Holder account: " + acc.getAccountHolder());
		//System.out.println("Balance: R$ " + acc.toString());
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = tc.nextDouble();
		acc.Withdraw(withdraw);
		System.out.println("========= Update account data ======== ");
		
		System.out.println(acc);
		//System.out.println("Number account: " + acc.getAccountNumber());
		//System.out.println("Holder account: " + acc.getAccountHolder());
		//System.out.println("Balance: R$ " + acc.toString());
		
		tc.close();
		
	}

}
