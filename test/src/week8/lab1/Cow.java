package week8.lab1;

public class Cow extends Animal {

	//Constructor
		public Cow(String type, int age, char gender) {
		super(type, age, gender);
	}

		@Override
		public void eat() {
			System.out.println("Cow is eating");
		}

		@Override
		public void sleep() {
			System.out.println("Cow is sleeping");
		}

		@Override
		public void makeSound() {
			System.out.println("Mooooo");
		}


		//toString
			@Override
		public String toString() {
			return "Cow " + super.toString();
		}
		
		
		
		
	
}
