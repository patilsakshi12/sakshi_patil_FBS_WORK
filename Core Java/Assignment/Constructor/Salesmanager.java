class SalesManager
{
  int id;
  String name;
 double salary, incetive;
  int target;
  
   SalesManager()
{
   this.id=110;
   this.name="sneha";
   this.salary=20000;
   this.incetive=2000;
   this.target=1200000;
   System.out.println("default constructor");
}

  SalesManager(int id,String n,double s,double i,int t)
{
   this.id=id;
   this.name=n;
   this.salary=s;
   this.incetive=i;
   this.target=t;
   System.out.println("parameter constructor");
}
  void setId(int a)
  {
    id=a;
  }

  void setName(String str)
  {
    name=str;
  }
  
  void setSalary(double sal)
  {
    salary=sal;
  }
  
  void setIncetive(double i)
  {
    incetive=i;
  }
  
  void setTarget(int t)
  {
    target=t;
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
  double getIncetive()
  {
    return incetive;
}
  int getTarget()
  {
    return target;
}

void display()
{
  System.out.println("Id is:"+id);
  System.out.println("Name is:"+name);
  System.out.println("Salary is:"+salary);
  System.out.println("Incetive is"+incetive);
  System.out.println("Target is"+target);
}
} // class end here

class Test
{
  public static void main(String args[])
  {
    SalesManager s2= new SalesManager();
   // set value using setter
    s2.setId(103);
    s2.setName("Pooja");
    s2.setSalary(15000);
    s2.setIncetive(4000);
    s2.setTarget(100000);

  // get value using getter
     System.out.println(s2.getId());
      System.out.println(s2.getName());
       System.out.println(s2.getSalary());
        System.out.println(s2.getIncetive());
       System.out.println(s2.getTarget());
   
// display()
s2.display();
 SalesManager s3= new SalesManager(104,"Sakshi",35000,3500,135000);
 s3.display();
}
}