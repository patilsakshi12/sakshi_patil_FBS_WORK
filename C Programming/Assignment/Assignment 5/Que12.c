#include<stdio.h>
void main()
{
	int i,j,n;
	char ch;
	printf("Enter a number");
	scanf("%d",&n);
	for(i=n;i>=1;i--)
	{ 
        ch='a';
		for(j=1;j<=i;j++)
		{
			printf("%c ",ch++);
		}
		printf("\n");
	}
}
