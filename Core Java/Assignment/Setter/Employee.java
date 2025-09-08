class Employee
{
  int id;
  String name;
  double salary;

  void setId(int i)
  {
    this.id=i;
  }
  
  void setName(String n)
  {
    this.name=n;
  }
  
  void setSalary(double s)
  {
    this.salary=s;
  }
}

class Demo1
{
  public static void main(String args[])
  {
    Employee e1;
    e1=new Employee();
    e1.setId(101);
    e1.setName("Sakshi");
    e1.setSalary(15000);
    System.out.println(e1.id);
    System.out.println(e1.name);
    System.out.println(e1.salary);
}
}
