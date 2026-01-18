import java.util.Scanner;
class ReverseArray
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[5];
   int i;
   System.out.println("Enter the element of array");
   for(i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
  }
  
   System.out.println("Reverse element of array:");
   for(i=arr.length-1;i>=0;i--)
   {
     System.out.print(arr[i]+" ");
  }
}
}
   