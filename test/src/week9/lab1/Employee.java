package week9.lab1;

public class Employee extends Person {

	//Variables
	int salary;
	
	//Constructors
		public Employee(String name, int salary) {
		super(name);
		setSalary(salary);
		}
	//Getters & Setters

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
	//Overridden Getters & Setters
		@Override
		public String getDescription() {
			return ("An employee with a salary of " + salary);
	}	
	
}
