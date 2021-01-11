package week7.lab2;

public class Cat extends Animal {

	
	//Constructor
	public Cat(String type, int age, char gender) {
		super(type, age, gender);
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow meow");
	}
	

	//toString
		@Override
	public String toString() {
		return "Cat: " + super.toString();
	}
	
	
	
	
}
