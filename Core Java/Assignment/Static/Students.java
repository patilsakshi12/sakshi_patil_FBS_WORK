class Students
{
  int fbs_id;
  String s_name;
  double distance_traveled;
  
  static int student_count;
  static{
      //set default value
        student_count=0;
    }
  
  
  //constructor
  Students()
 {
   this.fbs_id=12;
   this.s_name="none";
   this.distance_traveled=10;
   student_count++;
   
  System.out.println("default constructor");
 }
   Students(int fbs_id,String n,double d)
 {
   this.fbs_id=fbs_id;
   this.s_name=n;
   this.distance_traveled=d;
   student_count++;
   System.out.println("Parameterised constructor");
 }

//setter
 void setFbsId(int f)
{
   this.fbs_id=f;
}
void setSname(String str)
{
  this.s_name=str;
}
void setDistance_traveled(double d)
{
   this.distance_traveled=d;
}

void setStudentCount(int c)
{
   this.student_count=c;
}



//getter

int getFbsId()
{
   return this.fbs_id;
}
String getSname()
{
  return this.s_name;
}
double getDistance_traveled()
{
   return this.distance_traveled;
}

static int getStudentCount()
{
  return student_count;
}


      
//display
void display()
{
  System.out.println("fbs id is "+this.fbs_id );
  System.out.println("Student name is "+this.s_name);
  System.out.println("Distance Traveled "+this.distance_traveled );
  System.out.println("Student count is "+student_count);
 
  
}
}

class Test
{
   public static void main(String args[])
  {
    Students s1=new Students(1,"Sakshi",100);
   s1.display();
   Students s2=new Students(2,"Pooja",200);
   s2.display();
   s1.display();
   Students.getStudentCount();

     


}
}//class Test end here