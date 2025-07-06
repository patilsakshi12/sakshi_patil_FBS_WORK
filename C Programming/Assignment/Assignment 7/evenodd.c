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
	
	printf("\nEven number ");
	for(i=0;i<8;i++)
	{
		if(arr[i]%2==0)
		printf("%d ",arr[i]);
	}
	
	printf("\nodd Number ");
	for(i=0;i<8;i++)
	{
		if(arr[i]%2!=0)
		printf("%d",arr[i]);
	}
}
