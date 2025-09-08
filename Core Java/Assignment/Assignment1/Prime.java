class PrimeNo
{
public static void main(String args[])
{
  int num=7;
  int flag=0;
  int i=2;
  for(i=2;i<num;i++)
  {
   if(num%i==0)
   {
    flag=1;
    break;
    }
   }

   if(flag==0)
      System.out.println("Prime number");
   else
       System.out.println("Not Prime number");
}
}
   