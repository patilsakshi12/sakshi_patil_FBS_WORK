class Book
{
  String isbn;
  String title,author,publisher;
  double price;
 
  void setIsbn(String i)
  {
    this.isbn=i;
  }

  void setTitle(String str)
  {
    this.title=str;
  }
  
  void setAuthor(String a)
  { 
     this.author=a;
  }
  void setPublisher(String p)
  {
    this.publisher=p;
  }
  void setPrice(double pri)
  {
    this.price=pri;
  }

  String getIsbn()
  {
    return this.isbn;
  }
  String getTitle()
  {
    return this.title;
  }
  String getAuthor()
  {

   return this.author;
  }
   
 String getPublisher()
 {
   return this.publisher;
 }
 double getPrice()
 {
   return this.price;
 }

  void display()
  {
    System.out.println("ISBN is:"+this.isbn);
    System.out.println("Title is:"+this.title);
    System.out.println("Author is:"+this.author);
    System.out.println("Publisher is:"+this.publisher);
    System.out.println("Price is:"+this.price);
}
}// class Book end here

class Test
{
  public static void main(String args[])
  {
     Book b1=new Book();
     // set value using setter
     b1.setIsbn("978-3-18-xyz-234");
     b1.setTitle("Java Programming");
     b1.setAuthor("James Gosling");
     b1.setPublisher("Pearson Eduction");
     b1.setPrice(499);
     
    // get the value using getter
    System.out.println(b1.getIsbn());
    System.out.println(b1.getTitle());
    System.out.println(b1.getAuthor());
    System.out.println(b1.getPublisher());
    System.out.println(b1.getPrice());

  // display function
   b1.display();
}
}