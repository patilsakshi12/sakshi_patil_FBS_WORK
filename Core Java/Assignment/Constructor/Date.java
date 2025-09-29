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
  System.out.println("Default constructor");
 }

Date(int d,int m,int y, String s)
{
  this.day=d;
  this.month=m;
  this.year=y;
  this.dow=s;
  System.out.println("Parameterize constructor");
} 

void display()
{
  System.out.println(this.day+"/"+this.month+"/"+this.year);
  System.out.println(this.dow);

}

void setDay(int day)
{
  this.day=day;
}
int getDay()
{
  return this.day;
}

void setMonth(int m)
{
  this.month=m;
}
int getMonth()
{
  return this.month;
}

void setYear(int y)
{
  this.year=y;
}
int getYear()
{
  return this.year;
}
}// class Date end here

class Test
{
  public static void main(String args[])
 {

  Date d1;//reference
 d1=new Date();
 d1.setDay(4);
 d1.display();
d1=new Date();
d1=new Date();
 
Date d2=new Date(14,8,2025,"thu");
 d2.display();
}
}