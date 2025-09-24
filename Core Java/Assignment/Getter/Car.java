class Car
{
  String model;
  int year;
  double price;
  String brand;
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
    System.out.println("------Display info-----");
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
    System.out.println(c1.getModel());
    System.out.println(c1.getYear());
    System.out.println(c1.getPrice());
    System.out.println(c1.getBrand());

  // display function
   c1.display();
}
}