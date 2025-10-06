class ElectricityBill{
   int b_id;
   String name;
   int unit;
   static double ratePerUnit;
   static{
        //set default value for rate per unit
        ratePerUnit=10;
 }
 
   ElectricityBill()
   {
     this.b_id=1231;
     this.name="sakshi";
     this.unit=100;
     System.out.println("This a defalut constructor");
   }
    ElectricityBill(int b_id,String name,int unit)
   {
     this.b_id=b_id;
     this.name=name;
     this.unit=unit;
     System.out.println("This a Parameterized constructor");
   }
   
   // setter
   void setBid(int b)
  {
    this.b_id=b;
  }
  void setName(String n)
  {
    this.name=n;
  }
  void setUnit(int u)
  {
     this.unit=u;
  }
 static void setRatePerUnit(double rpu)
 {
   ratePerUnit=rpu;
 }
  
//getter
   int getBid()
  {
    return this.b_id;
  }
  String getName()
  {
    return this.name;
  }
  int getUnit()
  {
     return this.unit;
  }
  double getRatePerUnit()
 {
   return this.ratePerUnit;
 }

 //calculate bill
 void calculateBill()
{
   double totalElectricityBill=unit*ratePerUnit;
   System.out.println("TotalElectricityBill is: "+totalElectricityBill);
}

void display()
{
  System.out.println("Bill id is: "+this.b_id);
   System.out.println("Customer Name is: "+this.name);
    System.out.println("unit is: "+this.unit);
      System.out.println("RatePerUnit is: "+this.ratePerUnit);
   
 
}


   
}//class ElectricityBill end here

class Test
{
   public static void main(String args[])
  {
     ElectricityBill e1=new ElectricityBill(3456,"Pooja",110);
     e1.display();
     e1.calculateBill();
     System.out.println("\n");

     ElectricityBill e2=new ElectricityBill(4567,"Sneha",120);
     e2.display();
     e2.calculateBill();
     System.out.println("\n");

     ElectricityBill e3=new ElectricityBill(8907,"Kalayni",90);
     e3.display();
     e3.calculateBill();
    System.out.println("\n");

    ElectricityBill.setRatePerUnit(7.8);
     e1.display();
     e1.calculateBill();
     System.out.println("\n");

     e2.display();
     e2.calculateBill();
     System.out.println("\n");
     
    e3.display();
     e3.calculateBill();
     System.out.println("\n");
    
}
}
     
  