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
	 
}//class Admin end here

// Multilevel inheritance
class AreaSalesManager extends SalesManager{
	String areaName;
	
	 AreaSalesManager() {
		 System.out.println("Default AreaSalesManager constructor");
		this.areaName="Not Given";
	}

	AreaSalesManager(int id,String name,double salary,double incentive, int target,String areaName) {
		super(id,name,salary,incentive,target);
		System.out.println("Para AreaSalesManager constructor");
		this.areaName = areaName;
	}

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	void display()
	{
		super.display();
		System.out.println("AreaSalesManager Name: "+this.areaName);
	}
	 
}
class TestEmployeeNew {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		System.out.println();
		Employee e2=new Employee(101,"Sakshi",20000);
		e2.display();
		System.out.println();
		
		HR h1=new HR();
		h1.display();
		System.out.println();
		HR h2=new HR(111,"Prerna",30000,3000);
		h2.display();
		System.out.println();
		
		
		SalesManager s1=new SalesManager();
		s1.display();
		System.out.println();
		SalesManager s2=new SalesManager(112,"Nikita",45000,5500,50);
		s2.display();
		System.out.println();
		
		
		Admin a1=new Admin();
		a1.display();
		System.out.println();
		Admin a2=new Admin(104,"Sneha",30000,5000);
		a2.display();
		System.out.println();
		
		AreaSalesManager as1=new AreaSalesManager();
		as1.display();
		System.out.println();
		AreaSalesManager as2=new AreaSalesManager(115,"Roshani",60000,6000,20,"Mumabi");
		as2.display();
		

	}

}
