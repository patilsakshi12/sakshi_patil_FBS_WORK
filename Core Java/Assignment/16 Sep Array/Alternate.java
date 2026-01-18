import java.util.Scanner;
class Alternate{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[7];
   System.out.println("Enter the element of array");
   int i;
   for(i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Alternate element are:");
   for(i=0;i<arr.length;i=i+2)
  {
    System.out.print(arr[i]+" ");
}
}
}
  