class Demo2
{
  public static void main(String args[])
   {
     int n=122;
     int i=0;
     int rev=0,rem;
     int temp=n; 
     while(n>0)
     {
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
     }
     if(rev==temp)
     System.out.println("Palindrome number");
     else
     System.out.println("Not Palindrome number");
}
}
      
     