class Date
{
  int day,month,year;
  String dow;
  
  Date()     // default constructor
 {
   this.day=7;
   this.month=1;
   this.year=2023;
   this.dow="Sat";
}
void display()
{
  System.out.println(this.day+"/"+this.month+"/"+this.year);
  System.out.println(this.dow);
}
Date(int d,int m,int y, String s)
{
  this.day=d;
  this.month=m;
  this.year=y;
  this.dow=s;
}
}// class Date end here

class Test
{
  public Static void main(String args[])
 {
  Date d1;//reference
 d1=new Date();
 d1.display();
 
Date d2=new Date(14,8,2025,"thu");
}
}