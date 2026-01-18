class Student
{
  int fbsId;
  String sName;
  double distanceTraveled;
  
  static int student_count;
  static{
      //set default value
        student_count=0;
    }
  
  
  //constructor
  Student()
 {
	  System.out.println("Default student constructor");
   this.fbsId=0;
   this.sName="none";
   this.distanceTraveled=0;
   student_count++;
   
 
 }
   Student(int fbs_id,String n,double d)
 {
   System.out.println("Para Student Constructor");
   this.fbsId=fbs_id;
   this.sName=n;
   this.distanceTraveled=d;
   student_count++;
   
 }

//setter
 void setFbsId(int f)
{
   this.fbsId=f;
}
void setSname(String str)
{
  this.sName=str;
}
void setDistance_traveled(double d)
{
   this.distanceTraveled=d;
}

void setStudentCount(int c)
{
   this.student_count=c;
}



//getter

int getFbsId()
{
   return this.fbsId;
}
String getSname()
{
  return this.sName;
}
double getDistance_traveled()
{
   return this.distanceTraveled;
}

static int getStudentCount()
{
  return student_count;
}


      
//display
void display()
{
  System.out.println("fbs id is "+this.fbsId );
  System.out.println("Student name is "+this.sName);
  System.out.println("Distance Traveled "+this.distanceTraveled );
  
}
}//class Student  end here

class PlacedStudent extends Student // is a //step1  
{
	  String companyName;
	  String desgn;
	  
	  public PlacedStudent() {
		  super();  //step 2 
		  System.out.println("Default placed student constructor");
		   this.companyName="Kuni teri gya ";
		   this.desgn="Works at student";
	}
	PlacedStudent(int fbsId, String sName, double distanceTraveled, String companyName, String desgn) {
		  super(fbsId,sName,distanceTraveled); //step 2 B
		System.out.println("para placed student constructor");
	   
		this.companyName = companyName;
		this.desgn = desgn;
	}
	
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getDesgn() {
		return desgn;
	}
	void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	  
	void display()
	{
	   super.display();  //step3
	  System.out.println("Comapany is "+this.companyName);
	  System.out.println("Designation " +this.desgn);
	  
	}
	  
}// class placed student end here


class TestStudentNew {

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.display();
		System.out.println();
		
		Student s2 =new Student(101,"Sachin",300);
		s2.display();
		System.out.println();
		
		PlacedStudent ps1=new PlacedStudent();
		ps1.display();
		System.out.println();
		
		PlacedStudent ps2=new PlacedStudent(103,"Virat",300,"Bcci","Batsman");
		ps2.display();
		System.out.println("Total Student count "+Student.getStudentCount());
       
	}

}
