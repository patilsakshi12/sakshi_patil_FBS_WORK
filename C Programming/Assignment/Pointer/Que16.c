#include<stdio.h>
void printTable(int*);
void main()
{
	int n;
	printf("Enter a Number");
	scanf("%d",&n);
	printTable(&n);
}
void printTable(int* n)
{
	int i=1,res;
	while(i<=10)
	{
		res=*n*i;
		printf("%d * %d = %d\n",*n,i,res);
		i++;
	}
}
