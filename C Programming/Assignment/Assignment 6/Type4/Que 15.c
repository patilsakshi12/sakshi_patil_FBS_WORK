#include<stdio.h>
int findSum(int,int);
void main()
{
	int start, end;
	printf("Enter start Number");
	scanf("%d",&start);
	printf("Enter end number");
	scanf("%d",&end);
   int sum = findSum(start,end);
   printf("Sum= %d",sum);
}
int findSum(int start,int end){
	
	int sum=0;
	while(start<=end){
		sum=sum+start;
		start++;
	}
	return sum;

}
