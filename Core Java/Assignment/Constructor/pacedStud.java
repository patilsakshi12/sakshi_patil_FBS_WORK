class PlacedStudent{
  String companyName;
  int distance;
  String designation;
  
   PlacedStudent()
   {
     this.companyName="Infosyes";
     this.distance=20;
     this.designation="manager";
     System.out.println("Default constructor");
   }
     PlacedStudent(String c,int d,String desi)
   {
     this.companyName=c;
     this.distance=d;
     this.designation=desi;
     System.out.println("Parameterized constructor");
   }


  void setCompanyName(String n)
  {
    this.companyName=n;
  }
  void setDistance(int d)
 {
   this.distance=d;
 }
 void setDesignation(String str)
 {
   this.designation=str;
 }
 
 String getCompanyName()
 {
   return this.companyName;
 }
 int getDistance()
 {
   return this.distance;
 }
 String getDesignation()
{
 return this.designation;
}

void display()
{
  System.out.println("Company Name is:"+this.companyName);
  System.out.println("Distance is:"+this.distance);
  System.out.println("Designation is:"+this.designation);
}




}// class placed student here

class Test
{
  public static void main(String args[])
  {
    PlacedStudent s = new PlacedStudent();
    //set value using setter
    s.setCompanyName("TCS");
    s.setDistance(10);
    s.setDesignation("Manager");
   
   //get value using getter
    System.out.println("Using getter");
   System.out.println(s.getCompanyName());
   System.out.println(s.getDistance());
   System.out.println(s.getDesignation());

   // display function
     System.out.println("Using display function");
     s.display();
   
      PlacedStudent s1 = new PlacedStudent("Wipro",15,"Manager");
      s1.display();
     
}
}
