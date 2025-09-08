class SalesManager
{
  int id;
  String name;
 double salary, incetive;
  int target;

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
} // class end here

class Test2
{
  public static void main(String args[])
  {
    SalesManager s2= new SalesManager();
    s2.setId(103);
    s2.setName("Pooja");
    s2.setSalary(15000);
    s2.setIncetive(4000);
    s2.setTarget(100000);

     System.out.println(s2.id);
      System.out.println(s2.name);
       System.out.println(s2.salary);
        System.out.println(s2.incetive);
       System.out.println(s2.target);
   
}
}