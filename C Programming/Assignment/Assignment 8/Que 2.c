#include<stdio.h>
void main()
{
	int arr[7];
	int num,found=0;
	int i;
	
	printf("Enter element of array");
	for(i=0;i<7;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nsearch element of array");
	scanf("%d",&num);
int pos=searchNumber(arr,7,num);

	if(pos!=-1)
	printf("Element found at index %d\n",pos);
	else
	printf("Element not found");
}
int searchNumber(int* arr,int size,int num)
{
	int i;
	for(i=0;i<size;i++)
	{
		if(arr[i]==num)
		{
			return i;
		}
	}
	return -1;
}
