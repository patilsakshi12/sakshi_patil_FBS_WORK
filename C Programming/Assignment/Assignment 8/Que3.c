#include<stdio.h>
int findSum(int*,int);
void main()
{
	int arr[5];
	int i;
	printf("Enter array element");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int sum=findSum(arr,5);
	printf("Sum of array %d",sum);
}
int findSum(int* arr,int size)
{
	int i,sum=0;
	for(i=0;i<size;i++)
	{
		sum=sum+arr[i];
	}
	return sum;
}
