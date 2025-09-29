class Distance
{
   int feet;
   double inches;
   Distance()
   {
      this.feet=7;
      this.inches=5.6;
      System.out.println("Default constructor");
   }
    Distance(int f,double i)
   {
      this.feet=f;
      this.inches=i;
      System.out.println("Parameterized constructor");
   }
  
  void setFeet(int f)
 {
   this.feet=f;
 }
 void setInches(double i)
 {
   this.inches=i;
 }
 
 int getFeet()
 {
   return this.feet;
 }
 double getInches()
 {
   return this.inches;
 }

 void display()
 {
   System.out.println("Feet is:"+this.feet);
   System.out.println("Inches is:"+this.inches);
 }
}
 
class Test
{
  public static void main(String args[])
  {
    Distance d=new Distance();
    d.setFeet(5);
    d.setInches(6.5);    // function call
      System.out.println("Using getter");
    System.out.println(d.getFeet());
    System.out.println(d.getInches());
   
      System.out.println("Display function");
    d.display();
  
    Distance d1=new Distance(8,6.7);
    d1.display();

   
}
}
   