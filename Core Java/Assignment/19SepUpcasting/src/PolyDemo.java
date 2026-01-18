class Employee1
{
  int id;
  String name;
  double salary;
 // default constructor
   Employee1() {
	   System.out.println("Default Employee constructor");
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0;
    }
    // parameter
    Employee1(int id,String name,double salary) {
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

class HR1 extends Employee1{  //step 1 is -a
	double commission;
	
	HR1(){
		super();  //call Employee default constructor step2 A
		  System.out.println("Default HR constructor");
		this.commission=0;
	}

	HR1(int id,String name,double salary,double commission) {  // step2 B
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

class SalesManager1 extends Employee1
{
	double incentive;
	int target;
	
	SalesManager1() {
		super(); // call Employee default constructor
		  System.out.println("Default SalesManger constructor");
		this.incentive=0;
		this.target=0;
	}

	SalesManager1(int id,String name,double salary,double incentive, int target) {
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
class Admin1 extends Employee1  //is a
{
	 double allowance;
	  Admin1() {
		 System.out.println("Default Admin constructor");
		this.allowance=0;
	}
	Admin1(int id,String name,double salary,double allowance) {
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



class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1; // reference
		e1=new Employee1(101,"Sakshi",20000);
		e1.display();
		System.out.println();
		
		e1=new SalesManager1(102,"Rohan",30000,300,30);
		e1.display();
		System.out.println();
		
		e1=new Admin1(103,"Virat",40000,400);
		e1.display();
		
		
		

	}

}
