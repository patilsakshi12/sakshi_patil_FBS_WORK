#include<stdio.h>
void main()
{
	int start,end;
	int i,sum=0;
	printf("Enter a start");
	scanf("%d",&start);
	printf("Enter a end");
	scanf("%d",&end);
	for(i=start;i<=end;i=i+2)
	{
		sum=sum+i;
	}
	printf("Sum of alternate number = %d",sum);
}
