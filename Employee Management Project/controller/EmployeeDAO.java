package employee.controller;

import employee.model.*;


public class EmployeeDAO {

	static Employee[] employeeArr;
	static int empCount;
	
	static {
		employeeArr=new Employee[100];
		empCount=0;
		
		employeeArr[empCount++]=new HR(101,"Sakshi",50000,5000);
		employeeArr[empCount++]=new HR(102,"Rucha",48000,4500);
		employeeArr[empCount++]=new HR(103,"Karan",47000,4000);
		
		employeeArr[empCount++]=new SalesManager(201,"Sneha",60000,12,8000);
		employeeArr[empCount++]=new SalesManager(202,"Pooja",58000,15,7500);
		employeeArr[empCount++]=new SalesManager(203,"Ritik",62000,10,9000);
		
		employeeArr[empCount++]=new Admin(301,"Isha",70000,10000);
		employeeArr[empCount++]=new Admin(302,"Kunal",68000,9500);
		employeeArr[empCount++]=new Admin(303,"Nikita",72000,11000);
		employeeArr[empCount++]=new Admin(304,"Jay",75000,12000);
		employeeArr[empCount++] = new AreaSalesmanager(401, "Neha", 65000, 18, 6000, "North Zone");
        employeeArr[empCount++] = new AreaSalesmanager(402, "Amit", 64000, 20, 5500, "South Zone");
        employeeArr[empCount++] = new AreaSalesmanager(403, "Manish", 63000, 16, 5800, "East Zone");
	}
	
	// add employee
	public void addEmployee(Employee e) {
		if(empCount<employeeArr.length) {
			employeeArr[empCount++]=e;
		}
		System.out.println("Employee is Full");
	}
	
	//search by employee ID
	  public  Employee searchEmployeeById(int id) {
		  for (int i = 0; i < empCount; i++) {
	            if (employeeArr[i].getId() == id) {
	                return employeeArr[i];
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
	    	    int index = -1;

	    
	    	    for (int i = 0; i < empCount; i++) {
	    	        if (employeeArr[i].getId() == id) {
	    	            index = i;
	    	            break;
	    	        }
	    	    }

	    	    if (index == -1) {
	    	        System.out.println("Employee not found");
	    	        return false;
	    	    }

	    	    for (int i = index; i < empCount - 1; i++) {
	    	        employeeArr[i] = employeeArr[i + 1];
	    	    }

	    	    employeeArr[--empCount] = null;  
	    	    return true;
	    	}
	    
	    //display
	    public void displayAll() {
	        if (empCount == 0) {
	            System.out.println("No employees to display.");
	            return;
	        }
	        for (int i = 0; i < empCount; i++) {
	            System.out.println(employeeArr[i]);
	            System.out.println("Total Salary: " + employeeArr[i].calculateSalary());
	            System.out.println("-----------------------------------");
	        }
	    }

    
	    //sort by salary
	    public void sortBySalaryAndDisplay() {
	        if (empCount == 0) {
	            System.out.println("employees Not sort.");
	            return;
	        }

	        
	        for (int i = 0; i < empCount - 1; i++) {
	            for (int j = 0; j < empCount - i - 1; j++) {
	                if (employeeArr[j].calculateSalary() > employeeArr[j + 1].calculateSalary()) {
	                    Employee temp = employeeArr[j];
	                    employeeArr[j] = employeeArr[j + 1];
	                    employeeArr[j + 1] = temp;
	                }
	            }
	        }

	        // Display sorted employees
	        System.out.println("\n Employees Sorted ");
	        for (int i = 0; i < empCount; i++) {
	            System.out.println(employeeArr[i]);
	            System.out.println("Total Salary: " + employeeArr[i].calculateSalary());
	            System.out.println("-----------------------------------");
	        }
	    } 
	        // Return array of all employees
	        public Employee[] getAllEmployee() {
	            return employeeArr;
	        }

	        //   current count
	        public static int getEmpCount() {
	            return empCount;
	        }

	    
 }

