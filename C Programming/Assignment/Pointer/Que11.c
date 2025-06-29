#include<stdio.h>
void checkMarks(int*);

void main()
{   int marks;
	printf("Enter the marks");
	scanf("%d", &marks);
	checkMarks(&marks); // call
}
void checkMarks(int* marks)
{
	
	if(*marks>75)
	{
		printf("Distinction");
	}
	else if(*marks>65)
	{
		printf("First class");
	}
	else if(*marks>55)
	{
		printf("Second class");
	}
	else if(*marks>=40)
	{
		printf("pass");
	}
	else
	printf("Fail");
}

