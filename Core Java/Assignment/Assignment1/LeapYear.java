class Test{
public static void main(String []a)
{
  int year=2003;
  if(year%4==0 && year%100!=0 || year%400==0)
  System.out.println("Leap Year");
  else
  System.out.println("Not Leap Year");
}
}