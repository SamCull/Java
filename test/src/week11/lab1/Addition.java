package week11.lab1;

//Addition program
import javax.swing.JOptionPane; // program uses JOptionPane
	public class Addition{
		public static void main( String [] args ){
			//obtain user input
			String fnum = JOptionPane.showInputDialog( "Enter first integer " );
			String snum = JOptionPane.showInputDialog( "Enter second integer" );
			//convert string inputs to int values
			int num1 = Integer.parseInt( fnum );
			int num2 = Integer.parseInt( snum );
			int sum = num1 + num2;
			//display result
			JOptionPane.showMessageDialog( null, "The sum is " + sum,
					"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
}//end main
}//end class
