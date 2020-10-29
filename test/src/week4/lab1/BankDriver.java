package week4.lab1;

public class BankDriver {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.setSavingsBalance(3000.00);
		
		
		//Modify interest to 5% 
		SavingsAccount.modifyInterestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		BankCustomer bc = new BankCustomer("John", "Cork");
		bc.addAccount(saver1);
		bc.addAccount(saver2);
		
		System.out.println(bc);
		System.out.println("Savings Total: " + bc.balance(bc.getSavaccs()));
		
	} //end main

} //end class
