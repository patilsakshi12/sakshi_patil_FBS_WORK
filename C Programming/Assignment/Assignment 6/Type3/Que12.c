#include<stdio.h>
void checkdivisible(int);
void main()
{
	int num;
	printf("Enter the number");
	scanf("%d",&num);
	checkdivisible(num);
}
void checkdivisible(int num)
{
	if(num%3==0 && num%5==0)
	printf("Divisible by both\n");
	else if(num%3==0 && num%5 !=0)
	printf("Divisible by 3 but not by 5\n");
	else if(num%5==0 && num%3 !=0)
	printf("Divisible by 5 but not by 3\n");
	else
	printf("Divisible by none");
}
