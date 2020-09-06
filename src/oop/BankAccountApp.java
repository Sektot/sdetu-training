package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "172863781";
	
		
		acc1.balance = 10000;
		acc1.setRate();
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("1238123214");
		System.out.println("SSN "+ acc1.getSsn());
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//Polymorphism trough overriding
		System.out.println(acc1.toString());
		
		
		
		//Polymorphism trough overloading
		BankAccount acc2 = new BankAccount("Cheking Account");
		acc2.accountNumber = "837418123";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "726418762";
		
		/*
		acc3.checkBalance();
		
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.coumpount();
		*/
		
		

	}

}
