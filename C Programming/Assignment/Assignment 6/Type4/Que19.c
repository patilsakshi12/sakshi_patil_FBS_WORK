#include<stdio.h>
int fact(int);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
    int res=fact(n);
	printf("Factorial %d",res);
}
int fact(int n)
{

	int fact=1;

	int i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;

}
