#include<stdio.h>
void main()
{
	int start,end;
	printf("Enter a starting value");
	scanf("%d",&start);
	printf("Enter a ending value");
	scanf("%d",&end);
	int j;
	for(j=start;j<=end;j++){
	
	int n=j,rem,sum=0;
//	printf("Enter a Number");
//	scanf("%d",&n);
	int count;
	int temp=n;
	
	
	for(count=0;n>0;n=n/10)
	{
		count++;
	}
//	printf("The count of %d is %d",temp,count);
    n=temp;
    while(n>0)
    {
    	rem=n%10;
    	int res=1,i;
    	for(i=1;i<=count;i++)
    	{
    		res=res*rem;
		}
		sum=sum+res;
		n=n/10;
	}
	if(sum==temp)
	printf("%d ",temp);
	
}
}





