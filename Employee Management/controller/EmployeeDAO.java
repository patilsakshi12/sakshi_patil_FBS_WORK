package employee.controller;

import java.util.ArrayList;

import employee.model.*;


public class EmployeeDAO {

	static ArrayList<Employee> employees=new ArrayList<Employee>();

	
	static {
		
		employees.add( new HR(101,"Sakshi",50000,5000));
		employees.add (new HR(102,"Rucha",48000,4500));
		employees.add (new HR(103,"Karan",47000,4000));
		
		employees.add(new SalesManager(201,"Sneha",60000,12,8000));
		employees.add(new SalesManager(202,"Pooja",58000,15,7500));
		employees.add (new SalesManager(203,"Ritik",62000,10,9000));
		
		employees.add(new Admin(301,"Isha",70000,10000));
		employees.add(new Admin(302,"Kunal",68000,9500));
		employees.add(new Admin(303,"Nikita",72000,11000));
		employees.add(new Admin(304,"Jay",75000,12000));
		employees.add ( new AreaSalesmanager(401, "Neha", 65000, 18, 6000, "North Zone"));
        employees.add ( new AreaSalesmanager(402, "Amit", 64000, 20, 5500, "South Zone"));
        employees.add ( new AreaSalesmanager(403, "Manish", 63000, 16, 5800, "East Zone"));
	}
	
	// add employee
	public boolean addEmployee(Employee e) {
		 return employees.add(e);
		}
	
	
	//search by employee ID
	  public  Employee searchEmployeeById(int id) {
		  for (int i = 0; i <employees.size(); i++) {
	            if (employees.get(i).getId() == id) {
	                return employees.get(i);
	            }
	        }
	        return null;
	  }
	  
	  
	  //  Update salary
	    public boolean updateEmployee(int id, double newSalary) {
	        Employee e = searchEmployeeById(id);
	        if (e != null) {
	            e.setSalary(newSalary);
	            return true;
	        }
	        return false;
	    }

		//delete
	    public boolean deleteEmployee(int id) {
	        Employee e = searchEmployeeById(id);
	        if (e != null) {
	            employees.remove(e);
	            return true;
	        }
	        return false;
	    }

	    
	    //display
	    public void displayAll() {
	        if (employees.isEmpty()) {
	            System.out.println("No employees to display.");
	            return;
	        }

	        for (Employee e : employees) {
	            System.out.println(e);
	            System.out.println("Total Salary: " + e.calculateSalary());
	            System.out.println("-----------------------------------");
	        }
	    }

    
	    //sort by salary
	   
	    public void sortBySalaryAndDisplay() {
	        if (employees.isEmpty()) {
	            System.out.println("No employees to sort.");
	            return;
	        }

	       
	        for (int i = 0; i < employees.size() - 1; i++) {
	            for (int j = 0; j < employees.size() - i - 1; j++) {
	                if (employees.get(j).calculateSalary() > employees.get(j + 1).calculateSalary()) {
	                    
	                    Employee temp = employees.get(j);
	                    employees.set(j, employees.get(j + 1));
	                    employees.set(j + 1, temp);
	                }
	            }
	        }

	        
	        System.out.println("\n Employees Sorted ");
	        for (Employee e : employees) {
	            System.out.println(e);
	            System.out.println("Total Salary: " + e.calculateSalary());
	            System.out.println("-----------------------------------");
	        }
	    }

	        // Return array of all employees
	        public ArrayList<Employee> getAllEmployee() {
	            return employees;
	        }

	      
	    
 }

