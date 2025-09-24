class Product
{
  int id;
  String name;
  int quantity;
  double price;
  void setId(int i)
  {
    this.id=i;
  }

  void setName(String str)
  {
    this.name=str;
  }
  
  void setQuantity(int q)
  { 
     this.quantity=q;
  }
  void setPrice(double p)
  {
    this.price=p;
  }
   
  
  int getId()
  {
    return this.id;
  }
  String getName()
  {
    return this.name;
  }
  int getQuantity()
  {

   return this.quantity;
  }
  double getPrice()
  {
    return this.price;
  }

  void display()
  {
    System.out.println("ID is:"+this.id);
    System.out.println("Name is:"+this.name);
    System.out.println("Quantity is:"+this.quantity);
    System.out.println("Price is:"+this.price);
}
}// class Admin end here

class Test
{
  public static void main(String args[])
  {
     Product p=new Product();
     Product p1=new Product();
     // set value using setter
     p.setId(101);
     p.setName("Sakshi");
     p.setQuantity(10);
     p.setPrice(555.55);
    
    p1.setId(102);
     
    // get the value using getter
    System.out.println(p.getId());
    System.out.println(p.getName());
    System.out.println(p.getQuantity());
    System.out.println(p.getPrice());
   if(p.getId()>p1.getId())
   {
     System.out.println("P is older than p2");
   }
   else
  {
    System.out.println("P2 is older");
 }

  // display function
   p.display();
}
}