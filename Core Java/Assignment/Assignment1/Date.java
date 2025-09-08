class Date
{
  int day,month,year;
}// class date end here
class Test
{
  public static void main(String a[])
 {
   Date d1;
   d1=new Date();
   System.out.println(d1);
   System.out.println(d1.day);
   System.out.println(d1.month);
   System.out.println(d1.year);
   Date d2=new Date();
   System.out.println(d2);
}
}