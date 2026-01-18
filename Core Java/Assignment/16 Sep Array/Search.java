import java.util.Scanner;
class SearchElement
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int[] arr=new int[7];
   
    
   System.out.println("Enter the element of array");
   int i;
   for(i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }

   System.out.println("Search element of array");
   int num=sc.nextInt();
   boolean found=false;
    for(i=0;i<arr.length;i++)
     {
      if(arr[i]==num)
      {
          found=true;
           break;
      }
    }
   if(found==true)
    	System.out.println("Element found at index "+i);
	else
	System.out.println("Element not found");

  
   
}
}
