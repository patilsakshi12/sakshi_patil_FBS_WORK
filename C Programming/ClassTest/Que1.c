#include<stdio.h>
void main()
{
	int arr[5], brr[5];
	int i,j;
	printf("Enter element of arr\n");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter element of brr\n");
	
	for(j=0;j<5;j++)
	{
		scanf("%d",&brr[j]);
	}
	
	printf("Common Element ");
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(arr[i]==brr[j])
			{
				printf("%d ",arr[i]);
			     break;
			}
		}
	}
}
