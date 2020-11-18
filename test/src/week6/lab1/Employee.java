package week6.lab1;

public class Employee {
	
	//Variables
	private String fname;
	private String lname;
	private Address address;
	private static int nextstaffnumber = 1000;
	private int employeeNumber;
	private String empType;
	private String comCarType;

	
	//Constructors
		public Employee(String fname, String lname, Address address, String empType) {
			setEmployeeNumber(nextstaffnumber);
			setFname(fname);
			setLname(lname);
			setAddress(address);
			setEmpType(empType);
			nextstaffnumber++;
	}
	
	
	//Getters & Setters
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getComCarType() {
		return comCarType;
	}
	public void setComCarType(String comCarType) {
		this.comCarType = comCarType;
	}



	
	public static int noOfEmployees() {
		return nextstaffnumber-1000;
	}
	
	//toString
		@Override
	public String toString() {
			if(empType.equalsIgnoreCase("Manager")) {//emp type of staff or manager
			
		return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", employeeNumber="
				+ employeeNumber + ", empType=" + empType + ", comCarType=" + comCarType + "]";
	}
		
		else {
			return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", employeeNumber="
					+ employeeNumber + ", empType=" + empType + "]";
			}

		}
		
}
