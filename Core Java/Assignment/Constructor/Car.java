class Car
{
  String model;
  int year;
  double price;
  String brand;
  Car()
  {
    this.model="Nexon";
    this.year=2004; 
    this.price=9000000;
    this.brand="Tata";
    System.out.println("Default constructor call");
  }
  Car(String m,int y,double p,String b)
  {
    this.model=m;
    this.year=y; 
    this.price=p;
    this.brand=b;
        System.out.println("Parameterized constructor call");
  }

  void setModel(String m)
  {
    this.model=m;
  }

  void setYear(int yr)
  {
    this.year=yr;
  }
  
  void setPrice(double p)
  { 
     this.price=p;
  }
  void setBrand(String b)
  {
    this.brand=b;
  }
   
  
  String getModel()
  {
    return this.model;
  }
  int getYear()
  {
    return this.year;
  }
  double getPrice()
  {

   return this.price;
  }
  String getBrand()
  {
    return this.brand;
  }

  void display()
  {
   
    System.out.println("Model are:"+this.model);
    System.out.println("Year is:"+this.year);
    System.out.println("Price is:"+this.price);
    System.out.println("Brand is:"+this.brand);
}
}// class Car end here

class Test
{
  public static void main(String args[])
  {
     Car c1=new Car();
     // set value using setter
    
     c1.setModel("Swift VXi");
     c1.setYear(2023);
     c1.setPrice(850000.50);
     c1.setBrand("Maruti Suzuki");
     
    // get the value using getter
     System.out.println("Using getter");
    System.out.println(c1.getModel());
    System.out.println(c1.getYear());
    System.out.println(c1.getPrice());
    System.out.println(c1.getBrand());

  // display function
   System.out.println("Display Function");
   c1.display();
   
   Car c2=new Car("Creta", 2020, 678000,"Hyundai");
   c2.display();
}
}