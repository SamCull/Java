package week8.lab1;

public class PetVet {

	public static void main(String[] args) {
		
		Animal dog = new Dog("Buster", 12, 'M');
		Animal cat = new Cat("Diggs", 7, 'F');
		Animal cow = new Cow("Heffer", 9, 'M');
		
		Animal[] animals = new Animal[3]; //start of array
		animals[0]=dog;
		animals[1]=cat;
		animals[2]=cow;
		
		
		for(Animal ani: animals) {
			System.out.println(ani);
			ani.eat();
			ani.sleep();
			ani.makeSound();
			System.out.println("");
		}
		
		//creating vet object
		Vet v = new Vet("Dr John");
		
		//calling vaccinate method for dog and cat
		v.vaccinate(dog);
		v.vaccinate(cat);

		
		
	}

}
