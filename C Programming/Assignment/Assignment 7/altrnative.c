#include<stdio.h>
void main()
{
	int arr[5];
	int i;
	printf("Enter element of array");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nAlternate element array");
	for(i=0;i<5;i=i+2)
	{
		printf("%d ",arr[i]);
	}
}
