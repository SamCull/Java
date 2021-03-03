package GUIBUILDER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		int customer;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose a number to view a customer tab");
		System.out.println("1. Insert Customer");
		System.out.println("2. Display Customer");
		System.out.println("3. Update Customer");
		System.out.println("4. Delete Customer");
		System.out.println("5. Exit");
		customer = in.nextInt();
		
		if(customer == 1) {
			 final String DATABASE_URL = "jdbc:mysql://localhost/project";
		        Connection connection = null ;
		        PreparedStatement pstat = null;
		        String firstname = "Holly";
		        String lastname = "Fitz";
		        String phonenumber = "0853240247";
		        
		        int i=0;
		        try {
		        // establish connection to database
		        connection = DriverManager.getConnection(DATABASE_URL, "root", "" );
		        // create Prepared Statement for inserting data into table
		        pstat = connection.prepareStatement("INSERT INTO Customer (FirstName, LastName, PhoneNumber) VALUES (?,?,?)");
		        pstat . setString (1, firstname );
		        pstat . setString (2, lastname);
		        pstat . setString (3, phonenumber );
		        // insert data into table
		        i = pstat .executeUpdate();
		        System.out.println( i + " record successfully added to the table .");
		        }
		        catch(SQLException sqlException){
		        sqlException . printStackTrace () ;
		        }
		        finally {
		        try {
		        pstat . close () ;
		        connection. close () ;
		        }
		        catch (Exception exception){
		        exception . printStackTrace () ;
		                    }
		                }
		}//end if 1
		
		else if (customer ==2) {
			 final String DATABASE_URL = "jdbc:mysql://localhost/project";  //unknown database 'customer' error
			
			
				Connection connection = null;
				PreparedStatement pstat = null;
				ResultSet resultSet = null;
		try{
					
					// establish connection to database
					connection = DriverManager.getConnection(
					DATABASE_URL, "root", "" );
					
					// create Prepared Statement for querying table
					pstat = connection.prepareStatement("SELECT CustomerID, FirstName, LastName, PhoneNumber FROM Customer");
					
					// query database
					resultSet = pstat.executeQuery();
					
					// process query results
					ResultSetMetaData metaData = resultSet.getMetaData();
					int numberOfColumns = metaData.getColumnCount();
					System.out.println( "Customer Table of Project Database:\n" );
					
					 for ( int i = 1; i <= numberOfColumns; i++ )
					 System.out.print(metaData.getColumnName( i ) + "\t");
					 System.out.println();
					 
					 while(resultSet.next() ){
							for ( int i = 1; i <= numberOfColumns; i++ )
							System.out.print( resultSet.getObject( i ) + "\t\t");
							System.out.println();
							 }
						 }
						catch(SQLException sqlException ) {
							sqlException.printStackTrace();
						 }
						finally{
							try{
								resultSet.close();
								pstat.close();
								connection.close();
							}
							catch ( Exception exception ){
								exception.printStackTrace();
							}
						}
		}//end if 2
		
		else if (customer == 3) {
			final String DATABASE_URL = "jdbc:mysql://localhost/project";
			
	        String firstname = "Test";
	        String lastname = "Subject";
	        String phonenumber = "0861824472";
				Connection connection = null;
				PreparedStatement pstat = null;
				int i =0;
							
				try{
		              // establish connection to database
		              connection = DriverManager.getConnection(
		                  DATABASE_URL, "root","");
		              // create Prepared Statement for updating table
		              pstat = connection.prepareStatement("Update Customer SET phonenumber = ?, lastname = ? WHERE firstname = ?" );
		              //replaces position of ? with first and last name and phone number
		              pstat.setString(1, phonenumber);
		              pstat.setString(2, lastname);
		              pstat.setString(3, firstname);
		              

		              //Update data in database
		              i = pstat.executeUpdate();
		              System.out.print(i + " record successfuly updated in database");
		           }
		          catch(SQLException sqlException ) {
		              sqlException.printStackTrace();
		           }
		
				finally{
					try{
						pstat.close();
						connection.close();
					}
					catch ( Exception exception ){
						exception.printStackTrace();
					}
				} // end finally
		} //end if 3
		
		else if (customer == 4) {
			final String DATABASE_URL = "jdbc:mysql://localhost/project";
			
			Connection connection = null;
			PreparedStatement pstat = null;	
			int i = 0; //used to tell user if entry was successful	
			int customerID=9; // AuthorID # will be deleted from database				
			
			try{
				
				// establish connection to database
				connection = DriverManager.getConnection(
				DATABASE_URL, "root", "" );
				// create Statement for deleting from table
				pstat = connection.prepareStatement("Delete From Customer Where CustomerID=?");
				pstat.setInt(1, customerID);
				
				//Delete data in the database
				i = pstat.executeUpdate();
				System.out.print(i + " record successfuly removed from database");
				
			 }
			catch(SQLException sqlException ) {
				sqlException.printStackTrace();
			 }
			finally{
				try{
					pstat.close();
					connection.close();
				}
				catch ( Exception exception ){
					exception.printStackTrace();
				}
			}
		}//end if 4
		
		else if (customer == 5) {
			System.out.println("You have quit.");
			System.exit(customer);
		} //end if 5
		else {
			System.out.println("Invalid entry, please enter a number between 1-5 only");
		}
		
	}//end main 

}//end customer class
