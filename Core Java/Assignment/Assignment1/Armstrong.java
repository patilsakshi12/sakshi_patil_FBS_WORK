class Armstrong
{
  public static void main(String args[])
  {
    int n =153;
    int rem;
    int sum=0;
    int temp=n;
    while(n>0)
    {
      rem=n%10;
      sum=sum+(rem*rem*rem);
      n=n/10;
    }
    if(sum==temp)
    System.out.println("Armstrong number");
    else
    System.out.println("Not Armstrong number");
}
}
      
    
   