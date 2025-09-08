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
 
}
 class Demo2
 {
   public static void main(String args[])
  {
    Student s1;
    s1=new Student();
    s1.setRollNo(12);
    s1.setName("Rucha");
    s1.setMark(89);
    System.out.println(s1.rollno);
    System.out.println(s1.name);
    System.out.println(s1.mark);
}
}
