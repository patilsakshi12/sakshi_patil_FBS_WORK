#include<stdio.h>
void isPrime();
void main(){
	isPrime();
}
void isPrime(){

	int start,end;
	printf("Enter a starting value");
	scanf("%d",&start);
	printf("Enter a ending value");
	scanf("%d",&end);
	int j;
	for(j=start;j<=end;j++)
	{
	
	int n=j,flag=0;
//	printf("Enter a number");
//	scanf("%d",&n);
	int i;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag =1;
			break;
		}
	}
	if(flag==0)
	printf("%d ",j);
}
}
