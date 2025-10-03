class Student
{
    int rollno;
    String name;
    double percentage;
    
     Student()
   {
      this.rollno=1;
      this.name=null;
      this.percentage=1;
  }
   Student(int r,String n, double p)
   {
      this.rollno=r;
      this.name=n;
      this.percentage=p;
  }

   void setRollno(int rollno) {
        this.rollno = rollno;
    }

    void setName(String name) {
        this.name = name;
    }

  void setPercentage(double percentage) {
        this.percentage = percentage;
    }
     int getRollno() {
        return this.rollno;
    }

     String getName() {
        return this.name;
    }

    double getPercentage() {
        return this.percentage;
    }

  void display()
   {
       System.out.println("Rollno is: "+this.rollno);
       System.out.println("Name is: "+this.name);
       System.out.println("percentage is: "+this.percentage);
   }

}//class Student end here

class Employee
{
   
    int id;
    String name;
    double annualSalary;
    Employee()
   {
      this.id=0;
      this.name=null;
      this.annualSalary=0;
  }
    
   Employee(int id,String name, double a)
   {
      this.id=id;
      this.name=name;
      this.annualSalary=a;
  }
   
// setter
    void setId(int id) {
        this.id = id;
    }

     void setName(String name) {
        this.name = name;
    }

     void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
// getter
    int getId() {
        return this.id;
    }

     String getName() {
        return this.name;
    }

    double getAnnualSalary() {
        return this.annualSalary;
    }

   void display()
   {
       System.out.println("Id is: "+this.id);
       System.out.println("Name is: "+this.name);
       System.out.println("annualSalary is: "+this.annualSalary);
   }

}//class Employee end here

class Bank
{
   void approveLoan(Student s)
   {
     System.out.println("Loan Approval for student: " +s.getName());
     if(s.getPercentage()>80)
          System.out.println("Approved Loan 2 Lakh");
     else if(s.getPercentage()>=60 && s.getPercentage()<=80)
           System.out.println("Approved Loan 1 Lakh");
      else if(s.getPercentage()>=40 && s.getPercentage()<=60)
           System.out.println("Approved Loan 50k");
      else
          System.out.println("No Loan Approved");
           
           
   }
   void approveLoan(Employee e)
   {
       System.out.println("Loan Approval for Employee: " +e.getName());
     if(e.getAnnualSalary()>12)
          System.out.println("Approved Loan 7 Lakh");
     else if(e.getAnnualSalary()>=10 && e.getAnnualSalary()<=12)
           System.out.println("Approved Loan 6 Lakh");
      else if(e.getAnnualSalary()>=6 && e.getAnnualSalary()<=10)
           System.out.println("Approved Loan 5 Lakh");
        else if(e.getAnnualSalary()>=4 && e.getAnnualSalary()<=6)
           System.out.println("Approved Loan 4 Lakh");
      else
          System.out.println("No Loan Approved");
    
   }

}// class bank end here

class Test{
     public static void main(String args[])
     {
        Bank b1=new Bank();
        Student s1=new Student(101,"Sakshi",78.9);
         Student s2=new Student(102,"Kalyani",35.9);
        
        b1.approveLoan(s1);
        b1.approveLoan(s2);
        s1.display();
        s2.display();
        
        Employee e1=new Employee(201,"Rohit",11.5);
        Employee e2=new Employee(202,"Priya",3.5);
         b1.approveLoan(e1);
        b1.approveLoan(e2);
        e1.display();
        e2.display();
    }
}// class Test End here