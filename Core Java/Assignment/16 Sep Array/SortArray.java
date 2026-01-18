import java.util.Scanner;
import java.util.Arrays;
class SortArray{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int arr[]=new int[6];
    int i;
    System.out.println("Enter element of array");
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    
   //sort array
   Arrays.sort(arr);
   
   System.out.println("Sorted Array");
  for(i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+" ");
  }
}
}
