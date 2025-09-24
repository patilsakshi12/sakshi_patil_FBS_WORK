class HRM
{
  int id;
  String name;
  double salary;
  double commission;
 
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
     this.salary=sal;
  }
  void setCommission(double c)
  {
    this.commission=c;
  }

  int getId()
  {
    return id;
  }
  String getName()
  {
    return name;
  }
  double getSalary()
  {

   return salary;
  }
  double getCommission()
 {
    return this.commission;
 }

  void display()
  {
    System.out.println("ID is:"+this.id);
    System.out.println("Name is:"+this.name);
    System.out.println("Salary is:"+this.salary);
    System.out.println("Commission is:"+this.commission);
}
}// class HRM end here

class Test
{
  public static void main(String args[])
  {
     HRM h1=new HRM();
     // set value using setter
     h1.setId(101);
     h1.setName("Sakshi");
     h1.setSalary(20000);
     h1.setCommission(2000);
     
    // get the value using getter
    System.out.println(h1.getId());
    System.out.println(h1.getName());
    System.out.println(h1.getSalary());
    System.out.println(h1.getCommission());

  // display function
   h1.display();
}
}