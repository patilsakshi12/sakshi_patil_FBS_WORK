#include<stdio.h>
int prime();
void main()
{
int res=prime();
if(res==1)
printf("Prime");
else
printf("Not prime");
}
int prime()
{

	int n, i=2;
	printf("Enter a number");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
		  return 0;

		}
		
    }
    return 1;
}
