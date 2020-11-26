package week6.lab2;

public class PairOfDice {

	//Variables
	//Q. A PairOfDice is composed of two DICE.java objects
	private Dice dice1;
	private Dice dice2;
	
	
	//Constructors
	public PairOfDice() {
		dice1 = new Dice();  //gives each one
		dice2 = new Dice (); //a new value - calls Dice Constructor roll()
	}
	
	 
	
	public void roll() {
		dice1.roll();
		dice2.roll();
	}
	
	public String getFaceValues() {
		return "(" + dice1.getFaceValue() + "," + dice2.getFaceValue() + ")";
	}
	
	
	
}
