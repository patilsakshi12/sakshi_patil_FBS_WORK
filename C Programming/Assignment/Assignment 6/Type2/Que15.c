#include<stdio.h>
int findSum();
void main()
{
int sum=findSum();
printf("Sum= %d",sum);
}
int findSum(){
	
	int start, end, sum=0;
	printf("Enter start Number");
	scanf("%d",&start);
	printf("Enter end number");
	scanf("%d",&end);
	while(start<=end){
		sum=sum+start;
		start++;
	}
	return sum;

}
