package week6.lab1;

import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) { //menu system uses Scanner
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		Employee[] emps = new Employee[5]; //max of 5 records
		Office[] offices = new Office[3]; //display 3 records automatically
		
		for(int y=0; y<=2;y++) {
			Office of = new Office();
			offices[y]=of; //y = 0		}
		}
		while(choice !=4) {
			System.out.println("Select one of the following options: ");
			System.out.println("1. List all offices ");
			System.out.println("2. Create a new employee record ");
			System.out.println("3. List all employees ");
			System.out.println("4. Exit ");
			choice = in.nextInt();
			
			if(choice == 1) { 
				for(Office of: offices) {
					System.out.println(of + "\t" + "No. of employees: " + of.getNoOfEmps());
				
				if(of.getNoOfEmps() !=0) {
					System.out.println("Employees: " + "\n" + of.printEmployee());
					}
				}
			} //end choice 1
			
			else if(choice == 2) { 
				if(emps.length <=5) {
					String fname;
					String lname;
					String street;
					String city;
					String county;
					String empType;
					String comCarType = null;
					Scanner InEmp = new Scanner(System.in);
					
					System.out.println("Enter employee first name here: ");
					fname = InEmp.nextLine();
					System.out.println("Enter employee last name here: ");
					lname = InEmp.nextLine();
					System.out.println("Enter street here: ");
					street = InEmp.nextLine();
					System.out.println("Enter city here: ");
					city = InEmp.nextLine();
					System.out.println("Enter county here: ");
					county = InEmp.nextLine();
					System.out.println("Enter employee type (Manager/Staff) ");
					empType = InEmp.nextLine();
					
					if(empType.equalsIgnoreCase("Manager")) {
						System.out.println("Enter company car type");
						comCarType = InEmp.nextLine();
					}
					
					Address add = new Address(street,city,county);
					Employee emp = new Employee(fname, lname, add, empType); //from constructors
					emp.setComCarType(comCarType);
					emps[Employee.noOfEmployees()]=emp;
					for (Office of: offices) {
						if(of.getNoOfEmps()<=2) {
							of.addEmployee(emp);
							break;
						}
					}
				}
				else {
					System.out.println("You've created the maximum amount of employees");
				}
			}
			
			else if (choice == 3) { 
				for(Employee emp: emps) {
					if(emp != null)
						System.out.println(emp);
				}
			}//end choice 3
			
			else if (choice == 4 ) {
				System.out.println ("Goodbye");
				System.exit(0);
			}//end choice 4
			
		}//end while
		
	}//end main
	
}//end class