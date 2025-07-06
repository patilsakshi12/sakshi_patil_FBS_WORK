#include<stdio.h>
void main()
{
	int start,end;
	printf("Enter a start");
	scanf("%d",&start);
	printf("Enter a end");
	scanf("%d",&end);
	int j;
	for(j=start;j<=end;j++)
	{
	
	
	    int n=j;
//	printf("Enter a number");
//	scanf("%d",&n);
	    int i;
     	for(i=1;i<=n;i++)
     	{
	    	if(n%i==0)
	    	{
		    	printf("%d ",i);
		    }
    	}
    	printf("\n");
   }
}
