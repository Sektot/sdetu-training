package oop;

public class CDAccount extends BankAccount implements IRate{
	
	String interestRate;
	
	void coumpount() {
		System.out.println("Compounding interest");
	}
	

}
