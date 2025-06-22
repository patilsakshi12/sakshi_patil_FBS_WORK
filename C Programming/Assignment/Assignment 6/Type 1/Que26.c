#include<stdio.h>
void perfectNum();
void main()
{
	perfectNum();
}
void perfectNum(){

	int start,end;
	printf("Enter a Starting value");
	scanf("%d",&start);
	printf("Enter a ending value");
	scanf("%d",&end);
	int j;
	for(j=start;j<=end;j++)
	{
	
	int n=j,sum=0;
	//printf("Enter a number");
//	scanf("%d",&n);
	int i;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	printf("%d ",sum);
}

}
