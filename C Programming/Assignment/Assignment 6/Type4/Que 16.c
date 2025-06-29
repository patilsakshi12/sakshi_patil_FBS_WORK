#include<stdio.h>
int prime(int);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
    int res=prime(n);
    if(res==1)
        printf("Prime");
    else
        printf("Not prime");
}
int prime(int n)
{
     int i;

	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
		  return 0;

		}
		
    }
    return 1;
}
