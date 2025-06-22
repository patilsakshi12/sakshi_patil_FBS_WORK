#include<stdio.h>
void strong();
void main()
{
	strong();
}
void strong(){

	int start,end;
	printf("Enter a starting value");
	scanf("%d",&start);
	printf("Enter a ending value");
	scanf("%d",&end);
	int j;
	for(j=start;j<=end;j++){
	
	int num=j, rem, sum=0;
	//printf("Enter a NUmber");
	//scanf("%d",&num);
	int temp;
	for(temp=num;num>0;num=num/10)
	{
		rem=num%10;
	    int fact=1,i;
		for(i=1;i<=rem;i++){
			fact=fact*i;
		}
		sum=sum+fact;
	}
	if(sum==temp)
	printf("%d ",sum);
}
}
