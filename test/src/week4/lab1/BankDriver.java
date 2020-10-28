package week4.lab1;

public class BankDriver {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.setSavingsBalance(3000.00);
		
		
		SavingsAccount.modifyInterestRate(0.04f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		
		System.out.println(saver1);
		System.out.println(saver2);
		
		
		//Modify interest to 5% 
		System.out.println();
		SavingsAccount.modifyInterestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		 
		 
		System.out.println(saver1);
		System.out.println(saver2);
		
	} //end main

} //end class
