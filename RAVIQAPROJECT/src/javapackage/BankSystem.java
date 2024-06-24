package javapackage;

public class BankSystem {

	BankSystem(String username,String password)
	{
		System.out.println("The name of user "+username+ " "+password);
	}
	
	// Globally 
	double amt =5000;
	
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("This  balance after deposit is "+amt);
	}
	
	void deposit(double dep)
	{
		amt=amt +dep;
		System.out.println("The current balance after deposit again " +amt);
	}
	void withdraw(int wt)
	{
		amt = amt-wt;
		System.out.println("The balance after the withdraw "+amt);
	}
	double display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		// Create a object 
		BankSystem obj=new BankSystem("Rafat12","1234");
		// method overloading 
		obj.deposit(1000);
		obj.deposit(200.50);
		obj.withdraw(500);
		
		
		
		System.out.println(obj.display());
		
		BankCrendentails obj2= new BankCrendentails();
		obj2.logindetails();
		// method overriding 
		obj2.bankName();
	}

}


class BankDetails
{
  void bankName()
 {
	 System.out.println("The name of the bank");
 }
}

class BankCrendentails extends BankDetails
{
	  void logindetails()
	{
		System.out.println("Enter the username and password");
	}
	
	void bankName()
	{
		System.out.println("The name of bank is "+"citi bank");
	}
}
