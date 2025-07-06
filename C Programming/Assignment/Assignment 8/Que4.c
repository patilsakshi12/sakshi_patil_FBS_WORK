#include<stdio.h>
void main()
{
	int arr[8];
	int i;
	
	printf("Enter element of array");
	for(i=0;i<8;i++)
	{
		scanf("%d",&arr[i]);
	}
	evenodd(arr,8);
}
void evenodd(int* arr,int size)
{	
	printf("\nEven number ");
	int i;
	for(i=0;i<size;i++)
	{
		if(arr[i]%2==0)
		printf("%d ",arr[i]);
	}
	
	printf("\nodd Number ");
	for(i=0;i<size;i++)
	{
		if(arr[i]%2!=0)
		printf("%d ",arr[i]);
	}
}
