class Product
{
  int pid;
  String pname;
  double costPrice;
  int quantity;
  static double discount;
  static{
      //set default value
        discount=5;
    }
  
  //constructor
  Product()
 {
   this.pid=12;
   this.pname="none";
   this.costPrice=35000;
   this.quantity=4;
  System.out.println("default constructor");
 }
   Product(int pid,String pname,double costPrice,int quantity)
 {
   this.pid=pid;
   this.pname=pname;
   this.costPrice=costPrice;
   this.quantity=quantity;
   System.out.println("Parameterised constructor");
 }

//setter
 void setPid(int p)
{
   this.pid=p;
}
void setPname(String str)
{
  this.pname=str;
}
void setCostPrice(double c)
{
   this.costPrice=c;
}
void setQuantity(int quantity)
{
  this.quantity=quantity;
}

static void setDiscount(double d)
{
   discount=d;
}

//getter
 int getPid()
{
   return this.pid;
}
String getPname()
{
  return this.pname;
}
double getCostPrice()
{
   return this.costPrice;
}
int getQuantity()
{
  return this.quantity;
}

double getDiscount()
{
   return this.discount;
}

//apply discount on cost price
double getDiscountPrice()
{
  return costPrice-(costPrice*discount/100);
}

//calculate selling price
double calculateSellingPrice()
{
  return getDiscountPrice()*quantity;
}

//display
void display()
{
  System.out.println("Product id is "+this.pid );
  System.out.println("Product name is "+this.pname );
  System.out.println("CostPrice  is "+this.costPrice );
  System.out.println("Quantity  is "+this.quantity);
  System.out.println("Discount is "+discount);
  System.out.println("Selling price is "+ calculateSellingPrice());
  System.out.println("-------------------------------------------------");
}
}// class Product end here

class Test
{
   public static void main(String args[])
  {
    Product p=new Product();   //default constructor call

    
     Product p1=new Product(101,"Laptop",50000,2);
     p1.display();
     Product p2=new Product(102,"Mobile",20000,4);
     p2.display();
        Product p3=new Product(110,"Tv",70000,7);
     p3.display();

    Product.setDiscount(10);
    p1.display();
    p2.display();
    p3.display();
}
}