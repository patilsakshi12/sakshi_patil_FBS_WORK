class Student{
 int rollno;
 String name;
 double mark;

 Student()
{
   this.rollno=110;
   this.name="sneha";
   this.mark=88;
   System.out.println("default constructor");
}
Student(int r,String n,double m)
{
   this.rollno=r;
   this.name=n;
   this.mark=m;
   System.out.println("Parameter constructor");
}

  
 void setRollNo(int rno)
 {
   this.rollno=rno;
 }
 
 void setName(String str)
 {
   this.name=str;
  
  }
 
  void setMark(double m)
  {
   this.mark=m;
  }
  
  int getRollNo()
  {
   return rollno;
  }
  String getName()
  {
    return name;
  }
  double getMark()
  {
    return mark;
  }

  void display()
  {
    System.out.println("Rollno is:"+this.rollno);
    System.out.println("Name is:" +name);
    System.out.println("Marks is:" +mark);
   
}  
 
}
 class Test
 {
   public static void main(String args[])
  {
    Student s;
    s=new Student();
    s.setRollNo(12);
    s.setName("Rucha");
    s.setMark(89);
    
     //get value using getter
    System.out.println(s.getRollNo());
    System.out.println(s.getName());
    System.out.println(s.getMark());
   
    //display function
    s.display();

   Student s1;
    s1=new Student(101,"Sakshi",90);
    s1.display();

    
}
}
