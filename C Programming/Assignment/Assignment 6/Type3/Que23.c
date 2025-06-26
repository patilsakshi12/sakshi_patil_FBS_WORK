#include<stdio.h>
void sum(int);
void main()
{
	int num;
    printf("Enter a number");
	scanf("%d",&num);
	sum(num);
}
void sum(int n)
{

	int fdig,ldig,sum;

	ldig=n%10;
	while(n>0)
	{
		fdig=n%10;
		n=n/10;
	}
	sum=fdig+ldig;
	printf("Sum=%d",sum);
}
