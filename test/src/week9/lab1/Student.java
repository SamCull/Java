package week9.lab1;

public class Student extends Person{

	//Variables
	String course;
	
	//Constructors
		public Student(String name, String course) {
		super(name);
		setCourse(course);
	}
		
	//Getters & Setters
	public String getCourse() {
			return course;
	}

		public void setCourse(String course) {
			this.course = course;
	}

		
	//Overridden Getters & Setters
	@Override
	public String getDescription() {
		return ("A student studying " + course);
	}
	

	
	
	
	
}
