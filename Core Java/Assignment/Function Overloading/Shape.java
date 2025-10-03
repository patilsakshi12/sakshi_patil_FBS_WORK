class Shape
{
  void calculateArea(Triangle t)
  {
      double area;
      area=0.5*t.getBase()*t.getHeight();
      System.out.println("Area of Triangle " +area);
     
  }
   void calculateArea(Circle c)
  {
     double area;
     area=3.14*c.getRadius()*c.getRadius();
     System.out.println("Area of Circle " +area);
  
  }
   void calculateArea(Rectangle r)
  {
      double area;
      area=r.getLength()*r.getbreadth();
      System.out.println("Area of Rectangle " +area);
  }
}//class shape end here

class Triangle
{
  double base;
  double height;

  //constructor default
  Triangle()
   {
     this.base=2;
     this.height=3;
   }
   //parameter constructor
   Triangle(double base,double height)
   {
      this.base=base;
      this.height=height;
   }
   
   // setter
   void setBase(double b)
   {
     this.base=b;
   }
   void setHeight(double h)
   {
     this.height=h;
   }
   
   //getter
    double getBase()
   {
     return this.base;
   }
   double getHeight()
   {
     return this.height;
   }
   
   // display
   void display()
   {
       System.out.println("Base: "+this.base);
       System.out.println("Height: "+this.height);
   }

}// class Triangle end here

class Circle
{
  double radius;
  
  //default con
   Circle(){
          this.radius=3;
   }
   // parameter constructor
   Circle(double r)
   {
         this.radius=r;
   }

   //setter
   void setRadius(double r)
   {
       this.radius=r;
   }
   // getter
   double getRadius()
   {
      return this.radius;
   }
   void display()
   {
      System.out.println("Radius: "+this.radius);
   }
}//class Circle end here

class Rectangle{
  double length;
  double breadth;

   Rectangle(){
             this.length=0;
             this.breadth=0;
   }
   Rectangle(double l, double b){
                       this.length=l;
                       this.breadth=b;
}

//setter
  void setLength(double l)
  {
     this.length=l;
   }
     void setbreadth(double b)
  {
     this.breadth=b;
   }
  
// getter
    double getLength()
  {
     return this.length;
   }
    double getbreadth()
  {
     return this.breadth;
   }
 // display

    void display()
   {
       System.out.println("Length: "+this.length);
       System.out.println("Breadth: "+this.breadth);
   }
}//class Rectangle end here

class Test{
   public static void main(String args[])
   {
        Shape s1=new Shape();
        Triangle t1=new Triangle(5,3);
        t1.display();
        s1.calculateArea(t1);
        Circle c1=new Circle(5);
        c1.display();
        s1.calculateArea(c1);
        Rectangle r1=new Rectangle(5,3);
        r1.display();
        s1.calculateArea(r1);
     }
}// class Test end here