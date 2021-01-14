package week9.lab1;

		//A TestPerson class creates a polymorphic array of type
		//Person, with one Employee and Student.
public class TestPerson {

	public static void main(String[] args) {

		Employee emp = new Employee("Tom", 60000);
		Student stu = new Student("Mary", "Programming");
		
		//start of array
		Person[] people = new Person[2];
		people[0] = emp; //position 1 = employee
		people [1] = stu; //position 2 = student
		
		for(Person p: people)
			System.out.println("Name " + p.getName() + "\t" + "Description: " + p.getDescription());
		
	}

}










