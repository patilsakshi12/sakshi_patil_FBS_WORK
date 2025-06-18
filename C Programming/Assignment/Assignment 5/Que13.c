#include<stdio.h>
void main()
{
	int i,j,n;
	printf("Enter a number");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=n;j>=i;j--){
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			if(i==1||j==1||i==j)
			printf("* ");
			else
			printf("  ");
			
		}
		printf("\n");
	}
	
	for(i=n;i>=1;i--)
	{
		for(j=n;j>=i;j--){
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			if(i==1||j==1||i==j)
			printf("* ");
			else
		    printf("  ");
		}
		printf("\n");
	}
}
