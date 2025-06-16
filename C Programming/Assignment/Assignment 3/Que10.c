#include<stdio.h>
void main()
{
	int num, fdig,ldig,sum;
	printf("Enter a number");
	scanf("%d",&num);
	ldig=num%10;
	while(num>0)
	{
		fdig=num%10;
		num=num/10;
	}
	sum=fdig+ldig;
	printf("Sum=%d",sum);
}
