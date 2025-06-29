#include<stdio.h>
void isFact(int*);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	isFact(&n);
}
void isFact(int* num)
{
	int i,fact=1;
	for(i=1;i<=*num;i++)
	{
		fact=fact*i;
	}
	printf("Factorial %d",fact);
	
}

