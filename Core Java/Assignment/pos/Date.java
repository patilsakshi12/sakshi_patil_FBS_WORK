class Date
{
  int date,month,year;
  String dow;
}  //Class date end here
class Test
{
  public static void main(String a[])
 {
   Date d1;
   d1=new Date();
   System.out.println(d1);
   d1.date=2;
   d1.month=9;
   d1.year=2025;
   d1.dow="Wed";
   System.out.println(d1.dow);
   System.out.println(d1.date+"/"+d1.month+"/"+d1.year);
   //System.out.println(d1.month);
  // System.out.println(d1.year);
  
   Date d2=new Date();
   System.out.println(d2);
 
}
}