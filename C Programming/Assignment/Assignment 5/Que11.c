#include<stdio.h>
void main()
{
	int i,j,n;
	char ch;
	printf("Enter a number");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{ 
	  ch='A';

		for(j=1;j<=i;j++)
		{
			printf("%c ",ch++);
		}
		printf("\n");
	}
}
