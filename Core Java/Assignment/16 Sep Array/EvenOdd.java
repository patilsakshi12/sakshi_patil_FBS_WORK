import java.util.Scanner;
class EvenOdd
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[7];
    int i;
    System.out.println("Enter element of array");
    for(i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Even Element are");
   for(i=0;i<arr.length;i++)
   {
     if(arr[i]%2==0)
       System.out.print(arr[i] +" ");
   }
    System.out.printf("\n");
    System.out.println("Odd Element are");
   for(i=0;i<arr.length;i++)
   {
     if(arr[i]%2!=0)
       System.out.print(arr[i] +" ");
   }
     
}
}