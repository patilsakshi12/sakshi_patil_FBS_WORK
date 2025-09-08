class Date{
 int day,month,year;
 String dow;

 void setDay(int d)
 {
   this.day=d;
 }
  
 void setMonth(int m)
 {
   this.month=m;
 }

 void setYear(int y)
 {
   this.year=y;
 }

 void setDow(String str)
 {
   this.dow=str;
 }

}

class Test{
public static void main(String []args)
{
  Date d1;
  d1=new Date();
  d1.setDay(3);
  d1.setMonth(9);
  d1.setYear(2025);
  d1.setDow("Wed");
  System.out.println(d1.day);
  System.out.println(d1.month);
  System.out.println(d1.year);
  System.out.println(d1.dow);
}
}