class Employee
{
  int id;
  String name;
  double salary;
 // default constructor
   Employee() {
	   System.out.println("Default Employee constructor");
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0;
    }
    // parameter
    Employee(int id,String name,double salary) {
    	System.out.println("Para Employee constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
  int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
void display()
  {
    System.out.println("ID is:"+this.id);
    System.out.println("Name is:"+this.name);
    System.out.println("Salary is:"+this.salary);
}
   //overridden
  double calculateSalary()
  {
	  return salary;
  }
}// class employee end here

class HR extends Employee{  //step 1 is -a
	double commission;
	
	HR(){
		super();  //call Employee default constructor step2 A
		  System.out.println("Default HR constructor");
		this.commission=0;
	}

	HR(int id,String name,double salary,double commission) {  // step2 B
		super(id,name,salary);   //call Employee Parameterized constructor
		  System.out.println("Para HR constructor");
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		super.display();// step3
		System.out.println("Commission is: "+this.commission);
	}
	
	 double calculateSalary()
	  {
		  return salary+ commission;
	  }
}// class HR end here

class SalesManager extends Employee
{
	double incentive;
	int target;
	
	SalesManager() {
		super(); // call Employee default constructor
		  System.out.println("Default SalesManger constructor");
		this.incentive=0;
		this.target=0;
	}

	SalesManager(int id,String name,double salary,double incentive, int target) {
		super(id,name,salary);    //call Employee Parameterized constructor
		 System.out.println("Para Salesmanager constructor");
		this.incentive = incentive;
		this.target = target;
	}
	
	
	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	void display()
	{
		super.display();
		System.out.println("Incentive is: "+this.incentive);
		System.out.println("Target is: "+this.target);
	}
	 double calculateSalary()
	  {
		  return salary+incentive;
	  }
}
class Admin extends Employee  //is a
{
	 double allowance;
	  Admin() {
		 System.out.println("Default Admin constructor");
		this.allowance=0;
	}
	Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		 System.out.println("para admin constructor");
		this.allowance = allowance;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	  {
	    super.display();
	    System.out.println("Allowance is:"+this.allowance);
	}
	 double calculateSalary()
	  {
		  return this.salary+this.allowance;
	  }
	 
}//class Admin end here

class TestEmployee {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Employee e1; // generic reference
				e1=new Employee(101,"Sakshi",20000);
				System.out.println("--------Employee-----------");
				e1.display();
			    System.out.println("Total Salary "+e1.calculateSalary());
				System.out.println();
      
		       e1=new HR(102,"Pooja",30000,5000);
		       System.out.println("--------HR Employee----------");
		       e1.display();
		       System.out.println("Total Salary "+e1.calculateSalary());
		       System.out.println();
		
		      e1=new SalesManager(102,"Rohan",30000,300,30);
		      System.out.println("--------SalesManager Employee----------");
		      e1.display();
		      System.out.println("Total Salary "+e1.calculateSalary());
		      System.out.println();
		
		
		
		     e1=new Admin(103,"Sneha",40000,400);
		     System.out.println("--------Admin Employee----------");
		     e1.display();
		     System.out.println("Total Salary "+e1.calculateSalary());
		
	}

}
