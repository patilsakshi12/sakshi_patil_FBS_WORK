#include<stdio.h>
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	if(n>0)
	{
		printf("Number is Positive");
	}
	else if(n<0)
	{
		printf("Number is Negative");
	}
	else
	{
		printf("Number is Neutral");
	}
}
