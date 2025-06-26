#include<stdio.h>
int fact();
void main()
{
int res=fact();
	printf("Factorial %d",res);
}
int fact()
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
	return fact;

}
