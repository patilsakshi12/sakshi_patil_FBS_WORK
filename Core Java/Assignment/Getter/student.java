class Student{
 int rollno;
 String name;
 double mark;
  
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

    
}
}
