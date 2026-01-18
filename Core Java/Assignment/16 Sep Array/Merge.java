import java.util.Scanner;
class Test
{
   public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int[] arr=new int[5];
    int[] brr=new int[4];
    
    System.out.println("Enter the element of array (arr):");
    for(int i=0;i<arr.length;i++)
    {
     arr[i]=sc.nextInt();
    }

   System.out.println("Enter the element of array (brr):");
    for(int i=0;i<brr.length;i++)
    {
     brr[i]=sc.nextInt();
    }
   
   //merge array
   int crr[]=new int[arr.length+brr.length];
  
   for(int i=0;i<arr.length;i++)
  {
    crr[i]=arr[i];
   }
    for (int i = 0; i < brr.length; i++) {
         crr[arr.length + i] = brr[i];
        }
      System.out.println("Merged array:");
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
}
}
    
    