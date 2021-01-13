package week8.lab1;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Buster", 12, 'M');
		 	//Can do it the way shown, or this way without arrays
		/*System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println(); */
		
		Animal cat = new Cat("Diggs", 7, 'F');
		/*System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound(); 

		System.out.println(); */

		Animal cow = new Cow("Heffer", 9, 'M');
		/*System.out.println(cat);
		cow.eat();
		cow.sleep();
		cow.makeSound(); 

		System.out.println(); */
		
		
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
		
		}
}