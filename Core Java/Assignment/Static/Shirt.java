class Shirt
{
  int sid;
  String brand;
  String type;
  double price;
  String size;
  static double change;
  static{
      //set default value
     change=0;
  }

  
  //constructor
  Shirt()
 {
   this.sid=12;
   this.brand="none";
   this.type="sports";
   this.price=1000;
   this.size="large";
  System.out.println("default constructor");
 }
   Shirt(int sid,String brand,String type,double price,String size)
 {
   this.sid=sid;
   this.brand=brand;
   this.type=type;
   this.price=price;
   this.size=size;
   System.out.println("Parameterised constructor");
 }

//setter
 void setSid(int s)
{
   this.sid=s;
}
void setBrand(String str)
{
  this.brand=str;
}
void setType(String t)
{
   this.type=t;
}

void setPrice(double p)
{
   this.price=p;
}
void setSize(String s)
{
  this.size=s;
}


//getter
 int getsid()
{
   return this.sid;
}
String getBrand()
{
  return this.brand;
}
String getType()
{
   return this.type;
}
double getPrice()
{
  return this.price;
}

String getSize()
{
   return this.size;
}

void calculateFinalPrice()
{
   change=0;
   switch(size)
   {
    case "medium":
    change=10;
     break;
   
    case "large":
    change=20;
     break;
   
    case "x-large":
    change=30;
     break;
    
     default:
      
  }
 return price+(price*change/100);
}
//display
void display()
{
  System.out.println("Shirt id is "+this.sid );
  System.out.println("Brand is "+this.brand);
  System.out.println("Type is "+this.type );
  System.out.println("Price  is "+this.price);
  System.out.println("Size is "+this.size);  
  System.out.println("Applied increment:"+change+"%");  
   System.out.println("Final Price is "+ calculateFinalPrice());
 
  
}
}// class Shirt end here

class Test
{
   public static void main(String args[])
  {
    Shirt s=new Shirt();   //default constructor call

    
     Shirt s1=new Shirt(1,"Peter England","Formal",1000,"Small"); 
     s1.display();
     s1.calculateFinalPrice();
     
     Shirt s2=new Shirt(2,"Levis","Casual",1000,"medium"); 
     s2.display();
     s2.calculateFinalPrice();

   Shirt s3=new Shirt(3,"USB","Casual",1000,"large"); 
     s3.display();
     s3.calculateFinalPrice();

  Shirt s4=new Shirt(4,"Adidas","Sports",1000,"x-large"); 
     s4.display();
     s4.calculateFinalPrice();


}
}//class Test end here