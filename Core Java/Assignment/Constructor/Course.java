class Course
{
  int courseId;
  String courseName;
  String duration;
  double fees;

  Course()
{
   this.courseId=110;
   this.courseName="Pooja";
   this.duration="3 month";
   this.fees=25000;
   System.out.println("Default constructor");
   System.out.println("***********************************");
}
 Course(int id,String n,String d,double f)
{
   this.courseId=id;
   this.courseName=n;
   this.duration=d;
   this.fees=f;
   System.out.println("Parameterized constructor");
}

  void setCourseId(int i)
  {
    this.courseId=i;
  }

  void setCourseName(String str)
  {
    this.courseName=str;
  }
  
  void setDuration(String dur)
  { 
     this.duration=dur;
  }
  void setFees(double f)
  {
    this.fees=f;
  }
   
  
  int getCourseId()
  {
    return this.courseId;
  }
  String getCourseName()
  {
    return this.courseName;
  }
  String getDuration()
  {

   return this.duration;
  }
  double getFees()
  {
    return this.fees;
  }

  void display()
  {    System.out.println("Course ID is:"+this.courseId);
    System.out.println("Course Name is:"+this.courseName);
    System.out.println("Course Duration is:"+this.duration);
    System.out.println("Course fees is:"+this.fees);
   
    System.out.println("***********************************");

}
}// class Course end here

class Test
{
  public static void main(String args[])
  {
     Course c=new Course();
     // set value using setter
     c.setCourseId(101);
     c.setCourseName("Java FullStack");
     c.setDuration("6 month");
     c.setFees(23600);
     
    // get the value using getter
    
    System.out.println(" Using getter");

    System.out.println(c.getCourseId());
    System.out.println(c.getCourseName());
    System.out.println(c.getDuration());
    System.out.println(c.getFees());
    System.out.println("***********************************");

  // display function
   
    System.out.println(" Display function");

   c.display();
   Course c1=new Course(102,"Python FullStack","6 month",48000);
   c1.display();
}
}