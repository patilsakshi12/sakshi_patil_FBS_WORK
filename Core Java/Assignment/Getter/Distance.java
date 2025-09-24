class Distance
{
   int feet;
   double inches;
  
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
   
    System.out.println(d.getFeet());
    System.out.println(d.getInches());
  
    d.display();
}
}
   