#include<stdio.h>
void printTable();
void main()
{
	printTable();
}
void printTable()
{
	int n,i=1,res;
	printf("Enter a Number");
	scanf("%d",&n);
	while(i<=10)
	{
		res=n*i;
		printf("%d * %d = %d\n",n,i,res);
		i++;
	}
}
