#include<stdio.h>
void main()
{
	int start,end;
	int i;
	printf("Enter a start");
	scanf("%d",&start);
	printf("Enter a end");
	scanf("%d",&end);
	
	printf("odd number");
	for(i=start;i<=end;i++)
	{
		if(i%2!=0)
		{
			printf("%d ",i);
		}
	}
	
	printf("\nEven Number");
	for(i=start;i<=end;i++)
	{
		if(i%2==0)
		printf("%d ",i);
	}
}
