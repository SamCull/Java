package personalstuff;

import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		double num1;
		double num2;
		double num3;
		double ans;
		char op;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();
		System.out.println("\n Enter an operator: (+ - * /)");
		
		op = reader.next().charAt(0);
	switch(op) {
		case '+': ans = num1 + num2;
			break;
		case '-': ans = num1 -num2; 
			break;
		case '*': ans = num1 * num2;
			break;
		case '/': ans = num1 / num2;
			break;
		default: System.out.println("\n Error, enter a correct operator");
			return;
		}//end switch
	
		System.out.println("\n The result is from " + num1 + "and " + num2 + "is: ");
		System.out.println(op + " " + ans);
	
	}//end main
	
}//end class