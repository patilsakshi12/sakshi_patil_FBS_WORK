class Test2
{
 public static void main(String args[])
 {
   int n=12345;
   int fdig=0;
   int lastdig=n%10;
   int i=0;
    int sum;
   while(n>0)
   {
     fdig=n%10;
     n=n/10;
   }
   sum=fdig+lastdig;
  System.out.println(sum+" fdig and lastdig");
}
}

   