#include<stdio.h>
void main()
{
	int arr[5],i,j,temp;
	printf("Enter element of array");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(i=0;i<4;i++)
	{
		for(j=0; j<4-i; j++)
		{
			if(arr[j]>arr[j+1])
			{
			
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
	    	}
		}
	}
	
	printf("\nSorted array");
	for(i=0;i<5;i++)
	{
		printf("%d ",arr[i]);
	}
}
