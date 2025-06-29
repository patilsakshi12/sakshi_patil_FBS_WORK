#include<stdio.h>
void sum(int*,int*); //function declaration
void main()
{
	int n1,n2;
	printf("Enter a number");
	scanf("%d%d",&n1,&n2);
	sum(&n1,&n2);// function call and actual parameter
	
	
}
 void sum(int* x,int* y) //formal parameter
{
      // function defination
	int res=*x+*y;
	printf("Sum of two number %d",res);
	
	
}
