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
	   
	printf("\nDisplay element of array");
	for(i=0;i<7;i++)
	{
	
	   printf("%d ",arr[i]);
    }
	   
	int max=arr[0];
	int min=arr[0];
	for(i=0;i<7;i++)
	{
	
	if(arr[i]>max)
	  max=arr[i];
	  
	if(arr[i]<min)
	  min=arr[i];
}
	  
	printf("\nMaximum = %d\nMinimum = %d",max,min);
	   
}
