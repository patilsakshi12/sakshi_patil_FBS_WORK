class Calculator
{
  // Addition
  void add(int a,int b)
 { 
   System.out.println("Addition is " +(a+b));
   System.out.println("void add(int a,int b)");
 }
 void add(double d1, double d2)
 {
    System.out.println("Addition is " +(d1+d2));
     System.out.println("void add(double d1,double d2)");
}
void add(int a,double d1)
{
  System.out.println("Addition is " +(a+d1));
   System.out.println("void add(int a,double d1)");
}
void add(double d1,int a)
{
   System.out.println("Addition is " +(d1+a));
   System.out.println("void add(double d1,int a)");
}

// substraction
 
void subtract(int a,int b)
 { 
   System.out.println("Substraction is " +(a-b));
   System.out.println("void add(int a,int b)");
 }
 void subtract(double d1, double d2)
 {
    System.out.println("Substraction is "+(d1-d2));
     System.out.println("void add(double d1,double d2)");
}
void subtract(int a,double d1)
{
  System.out.println("Substraction is " +(a-d1));
   System.out.println("void add(int a,double d1)");
}
void subtract(double d1,int a)
{
   System.out.println("substraction is " +(d1-a));
   System.out.println("void add(double d1,int a)");
}

// multiplication
void multiply(int a,int b)
 { 
   System.out.println("Multiplication is " +(a*b));
   System.out.println("void add(int a,int b)");
 }
 void multiply(double d1, double d2)
 {
     System.out.println("Multiplication is " +(d1*d2));
     System.out.println("void add(double d1,double d2)");
}
void multiply(int a,double d1)
{
  System.out.println("Multiplication is " +(a*d1));
   System.out.println("void add(int a,double d1)");
}
void multiply(double d1,int a)
{
   System.out.println("Multiplication is " +(d1*a));
   System.out.println("void add(double d1,int a)");
}

//divide

void divide(int a,int b)
 { 
   System.out.println("Division is " +(a/b));
   System.out.println("void add(int a,int b)");
 }
 void divide(double d1, double d2)
 {
    System.out.println("Division is " +(d1/d2));
     System.out.println("void add(double d1,double d2)");
}
void divide(int a,double d1)
{
  System.out.println("Division is " +(a/d1));
   System.out.println("void add(int a,double d1)");
}
void divide(double d1,int a)
{
   System.out.println("Division is " +(d1/a));
   System.out.println("void add(double d1,int a)");
}

}// class calculator end here

class Test
{
  public static void main(String args[])
  {
    Calculator c1=new Calculator();
    // add
    c1.add(10,20);
    c1.add(10.2,20.2);
    c1.add(10,10.2);
    c1.add(10.2,10);

   //sub
    c1.subtract(10,20);
    c1.subtract(10.2,20.2);
    c1.subtract(10,10.2);
    c1.subtract(10.2,10);
  
  // multiply
   c1.multiply(10,20);
    c1.multiply(10.2,20.2);
    c1.multiply(10,10.2);
    c1.multiply(10.2,10);

 // division
   c1.divide(20,10);
    c1.divide(20.2,10.2);
    c1.divide(10,5.5);
    c1.divide(10.2,10);

}
}
 






   









