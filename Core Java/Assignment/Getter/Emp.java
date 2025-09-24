class Employee
{
  int id;
  String name;
  double salary;
 
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

  void display()
  {
    System.out.println("ID is:"+id);
    System.out.println("Name is:"+name);
    System.out.println("Salary is:"+salary);
}
}// class employee end here

class Test
{
  public static void main(String args[])
  {
     Employee e1=new Employee();
     // set value using setter
     e1.setId(101);
     e1.setName("Sakshi");
     e1.setSalary(20000);
     
    // get the value using getter
    System.out.println(e1.getId());
    System.out.println(e1.getName());
    System.out.println(e1.getSalary());

  // display function
   e1.display();
}
}