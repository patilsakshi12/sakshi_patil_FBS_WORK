#include<stdio.h>
void main()
{
	int start, end, sum=0;
	printf("Enter start Number");
	scanf("%d",&start);
	printf("Enter end number");
	scanf("%d",&end);
	while(start<=end){
		sum=sum+start;
		start++;
	}
	printf("sum = %d",sum);
}
