#include<stdio.h>
void main()
{
	int arr[7];
	int i;
	printf("Enter a element of array:");
	for(i=0;i<7;i++)
	{
	   scanf("%d",&arr[i]);
    }
    printf("\nDisplay array");
    for(i=0;i<7;i++)
    {
    	printf("%d ",arr[i]);
	}
   int max= findMax(arr,7);
   int min= findMin(arr,7);
   printf("\nMaximum= %d\nMinimum = %d",max,min);
}
int findMax(int* arr,int size)
{
	int i;
	int max=arr[0];
	for(i=0;i<size;i++)
	if(arr[i]>max)
	{
	  max=arr[i];
    }
    return max;
	  
} 
int findMin(int* arr,int size)
{
	int i;
 	int min=arr[0];
	for(i=0;i<7;i++)
	{
	if(arr[i]<min)
	  min=arr[i];
   }
   return min;
	   
}
