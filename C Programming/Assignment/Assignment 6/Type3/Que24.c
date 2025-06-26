#include<stdio.h>
void printArmstrong(); // declare
void main()
{
	int start,end;
	printf("\nEnter a starting value");
	scanf("%d",&start);
	printf("Enter a ending value");
	scanf("%d",&end);
	printArmstrong(start,end); // call
}
 void printArmstrong(int start,int end) // def
 {
 
	
	int j;
	for(j=start;j<=end;j++){
	
	int n=j,rem,sum=0;

	int count;
	int temp=n;
	
	
	for(count=0;n>0;n=n/10)
	{
		count++;
	}
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





