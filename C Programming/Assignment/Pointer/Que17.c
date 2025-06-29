#include<stdio.h>
void findSum(int*,int*);
void main()
{
	int start, end, sum=0;
	printf("Enter start Number");
	scanf("%d",&start);
	printf("Enter end number");
	scanf("%d",&end);
	findSum(&start,&end);
}
void findSum(int* start,int* end){
	
	int sum=0;
	while(*start<=*end){
		sum=sum+ *start;
		(*start)++;
	}
	printf("sum = %d",sum);
}
