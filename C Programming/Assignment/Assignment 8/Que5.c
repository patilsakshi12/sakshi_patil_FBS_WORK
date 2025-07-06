#include<stdio.h>
void alternateNum(int*,int );
void main()
{
	int arr[5];
	int i;
	printf("Enter element of array");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	alternateNum(arr,5);
	printf("\nAlternate element array");
}
void alternateNum(int* arr,int size)
{
	int i;
	for(i=0;i<size;i=i+2)
	{
		printf("%d ",arr[i]);
	}
}
