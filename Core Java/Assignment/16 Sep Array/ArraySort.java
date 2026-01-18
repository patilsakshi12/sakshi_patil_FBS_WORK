import java.util.Scanner;
import java.util.Arrays;
class Arraysort
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   int arr[]=new int[7];
   
    System.out.println("Enter a array");
   
    int i,j,temp;
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
   }
   	
	for(i=0;i<arr.length-1;i++)
	{
		for(j=0; j<arr.length-1-i; j++)
		{
			if(arr[j]<arr[j+1])
			{
			
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
	    	}
		}
	}
      System.out.println("Sorted array");
      for(i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+ " ");
      }
}
}

         
   