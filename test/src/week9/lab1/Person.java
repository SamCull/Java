package week9.lab1;

public abstract class Person {

	//Variables
	private String name;
	private String description;
	
	
	//Constructors
	public Person(String name) {
		setName(name);
	}
	
	
	//Getters & Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getDescription();
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	//toString
	
	
}
