class Admin
{
  int id;
  String name;
  double salary;
  double allowance;
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
     Admin a=new Admin();
     // set value using setter
     a.setId(101);
     a.setName("Sakshi");
     a.setSalary(30000);
     a.setAllowance(5000);
     
    // get the value using getter
    System.out.println(a.getId());
    System.out.println(a.getName());
    System.out.println(a.getSalary());
    System.out.println(a.getAllowance());

  // display function
   a.display();
}
}