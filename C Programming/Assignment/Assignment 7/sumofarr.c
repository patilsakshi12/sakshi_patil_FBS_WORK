#include<stdio.h>

void main()
{
	int arr[5];
	int i,sum=0;
	printf("Enter array element");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
		sum=sum+arr[i];
	}
	printf("%d",sum);
}
