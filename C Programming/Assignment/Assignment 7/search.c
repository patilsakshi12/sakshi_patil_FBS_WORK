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
	for(i=0;i<7;i++)
	{
		if(arr[i]==num)
		{
			found =1;
			break;
		}
	}
	if(found==1)
	printf("Element found at index %d\n",i);
	else
	printf("Element not found");
}
