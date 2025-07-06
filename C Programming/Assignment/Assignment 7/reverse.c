#include<stdio.h>
void main()
{
	int arr[5],i;
	printf("Enter a element of array");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Reverse of array");
	for(i=4;i>=0;i--)
	{
		printf("%d ",arr[i]);
	}
}
