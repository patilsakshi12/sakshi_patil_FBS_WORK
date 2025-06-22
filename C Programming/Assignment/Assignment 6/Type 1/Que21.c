#include<stdio.h>
void fact();
void main()
{
	fact();
}
void fact()
{

	int n, fact=1;
	printf("Enter a number");
	scanf("%d",&n);
	int i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	printf("Factorial %d",fact);
}
