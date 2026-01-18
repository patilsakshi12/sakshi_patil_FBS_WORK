import java.util.Scanner;
class Sum
{
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("Enter the element of array");
    int i;
    int sum=0;
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
      sum=sum+arr[i];
   }
   System.out.println("Sum of array "+sum);
}
}
      