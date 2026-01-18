import java.util.Scanner;
class MinMax{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
  int[] arr=new int[5];
 
  System.out.println("Enter the element of array");
  
  int i;
  for(i=0;i<arr.length;i++)
  {
    arr[i]=sc.nextInt();
  }
  System.out.println("Array element are:");
  for(i=0;i<arr.length;i++)
  {
    System.out.println(arr[i]);
  }
   
  int max=arr[0];
  int min=arr[0];
 for(i=0;i<arr.length;i++)
 {
   if(arr[i]>max)
     max=arr[i];
  if(arr[i]<min)
     min=arr[i];
}
System.out.println("Maximum number " +max);
System.out.println("Minimum number " +min);
    

    
  
}
}
 