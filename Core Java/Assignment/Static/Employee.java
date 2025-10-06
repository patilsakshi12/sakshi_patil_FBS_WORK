class Employee{
  String name;
  double basicSalary;
   static double companyBonusRate;
   
  static{
          companyBonusRate=15;
      }
   
  Employee()
  {
    this.name="unkown";
    this.basicSalary=4000;
    System.out.println("This default cnstructor");
  }
   Employee(String name,double basicSalary)
  {
    this.name=name;
    this.basicSalary=basicSalary;
      System.out.println("This parameterized cnstructor");
  }

  //setter
  void setName(String str)
  {
    this.name=str;
  }
  void setBasicSalary(double s)
 {
    this.basicSalary=s;
  }
 static void setCompanyBonusRate(double c)
 {
   companyBonusRate=c;
 }

//getter
  String getName()
  {
    return this.name;
  }
  double getBasicSalary()
 {
   return this.basicSalary;
  }
  double getCompanyBonusRate()
 {
   return this.companyBonusRate;
 }

// calculate salary
 void calculateTotalSalary()
 {
    System.out.println("Total salary is "+ (basicSalary+(basicSalary * companyBonusRate/100)));
 }
//display
void display()
{
 System.out.println("Employee name is "+this.name );
  System.out.println("Basic Salary  is "+this.basicSalary );
   System.out.println("Company Bonus Rate is "+companyBonusRate );
  
  }

}//class Employee end here

class Test
{
   public static void main(String args[])
   {
     Employee e=new Employee();   //default constructor call
     Employee e1=new Employee("Sakshi",45000);
     e1.display();
     e1.calculateTotalSalary();
     System.out.println("\n");

     Employee e2=new Employee("Pooja",36000);
     e2.display();
     e2.calculateTotalSalary();
     System.out.println("\n");

     Employee e3=new Employee("Sneha",50000);
     e3.display();
     e3.calculateTotalSalary();
     System.out.println("\n");


    Employee.setCompanyBonusRate(9);
     e1.display();
     e1.calculateTotalSalary();
     System.out.println("\n");
     
     e2.display();
     e2.calculateTotalSalary();
     System.out.println("\n");

     e3.display();
     e3.calculateTotalSalary();
     System.out.println("\n");

     

      
     
}
}// class Test end here


     

     

     
  