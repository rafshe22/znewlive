package javapackage;

public class BankSystem {

	// Globally 
	int amt =5000;
	
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("This  balance after deposit is "+amt);
	}
	
	void withdraw(int wt)
	{
		amt = amt-wt;
		System.out.println("The balance after the withdraw "+amt);
	}
	int display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		// Create a object 
		BankSystem obj=new BankSystem();
		obj.deposit(1000);
		obj.withdraw(500);
		
		System.out.println(obj.display());
		
	}

}
