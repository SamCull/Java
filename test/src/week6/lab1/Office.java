package week6.lab1;

import java.util.Arrays;

public class Office {

	//Variables
	private static int nextOffice=100;
	private int officenumber;
	private int noOfEmps;
	private Employee[] employees = new Employee[2]; //max 2 people in office

	
	
	//Constructors
		public Office() {
		setOfficenumber(nextOffice);
				nextOffice++;
	}
	
	//Getters & Setters
		public int getOfficenumber() {
		return officenumber;
	}

	public void setOfficenumber(int officenumber) {
		this.officenumber = officenumber;
	}
	public int getNoOfEmps() {
		return noOfEmps;
	}
	public void setNoOfEmps(int noOfEmps) {
		this.noOfEmps = noOfEmps;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	
	//Misc Methods
	public void addEmployee(Employee employee) {
		if(noOfEmps <= 2) {
			employees[noOfEmps]=employee;
			noOfEmps++;
		}
		else {
			System.out.println("Reached maximum number of Employees");
		}
	
	}
	
	public String printEmployee() {
		String empDetails="";
		for(Employee emp:employees) {
			if(emp !=null) {
				empDetails+=emp.getEmployeeNumber() + "," + emp.getFname() + "," + emp.getLname() +"\n";
			}
		}
		return empDetails;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Office [officenumber=" + officenumber + "]";
	}
	
	

	
}
