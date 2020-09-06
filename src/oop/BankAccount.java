package oop;

public class BankAccount implements IRate{
	//Define variables
	String accountNumber;
	// static >> belong to the class not to the object instance
	// final >> constant ( often static final)
	private static final String routingNumber = "712863";
	//Instance variables
	private String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
	   // 1. They are used to define / setup / initialize properties of an object
	   // 2. Constructors are IMPLICITLY called upon instantiation
	   // 3. The same name as the class itself
	   // 4. Constructors have no return type
	BankAccount() {
		System.out.println("New Account Created");
	}
	// Overloading: call same method with differnet arguments
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit of: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			String errorMsg = "Error: Minimum deposit must be at least $ 1000";
		} else {
			 Msg = "Thanks for your initial deposit of: $ " + initDeposit ;
		}
		System.out.println(Msg);
		balance = balance+initDeposit;
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	
		
	}
	
	//Interface Methods
	public void setRate() {
		System.out.println("Setting Rate");
		
	}
	
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
	}
		
		//Getters / Setters
		
		//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
		
		
	}
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
		
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//Private: can only be called within the class
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction: " + activity);
		System.out.println("Your New Balance Is: $" + balance);
		
		
	}
	
	void checkBalance() {
		System.out.println("Balance:" + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name:" + name + ". Acount#" + accountNumber + ". Routing#" + routingNumber + ". Balance: $" + balance + " ]";
	}

}
