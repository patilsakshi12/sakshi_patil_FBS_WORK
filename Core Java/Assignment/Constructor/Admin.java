class Admin
{
  int id;
  String name;
  double salary;
   double allowance;

 //default constructor
  Admin()
  {
    this.id=101;
    this.name = "Pooja";
    this.salary = 15000;
    this.allowance=20000;
  }
   Admin(int i,String n,double s,double a)
  {
    this.id=i;
    this.name = n;
    this.salary = s;
    this.allowance=a;
  }

  void setId(int i)
  {
    this.id=i;
  }

  void setName(String str)
  {
    this.name=str;
  }
  
  void setSalary(double sal)
  { 
     salary=sal;
  }
  void setAllowance(double alw)
  {
    this.allowance=alw;
  }
   
  
  int getId()
  {
    return this.id;
  }
  String getName()
  {
    return this.name;
  }
  double getSalary()
  {

   return this.salary;
  }
  double getAllowance()
  {
    return this.allowance;
  }

  void display()
  {
    System.out.println("ID is:"+this.id);
    System.out.println("Name is:"+this.name);
    System.out.println("Salary is:"+this.salary);
    System.out.println("Allowance is:"+this.allowance);
}
}// class Admin end here

class Test
{
  public static void main(String args[])
  {
     //parameter constructor
     Admin a=new Admin();
     // set value using setter
     a.setId(101);
     a.setName("Sakshi");
     a.setSalary(30000);
     a.setAllowance(5000);
     
    // get the value using getter
    System.out.println("using Getter");
    System.out.println(a.getId());
    System.out.println(a.getName());
    System.out.println(a.getSalary());
    System.out.println(a.getAllowance());

  // display function
     System.out.println("\nUsing display() method:");
   a.display();

    Admin a1=new Admin(102,"Kunal",45000,5500);
    System.out.println("\nSecond Employee (Using Parameterized Constructor):");
   a1.display();
}
}