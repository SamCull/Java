package week7.lab1;

public class Person {

	//Variables
	private String name;
	private String address;

	
	
	//Constructors
		public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}


	//Getters & Setters 
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	
	//toString
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		}
	
}
	

