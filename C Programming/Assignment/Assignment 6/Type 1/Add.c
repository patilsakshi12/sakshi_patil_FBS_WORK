#include<stdio.h>
int sum(); //function declaration
void main()
{
	int res;
	res=sum();// function call
	printf("Sum of two number %d",res);
	
}
 int sum()
{
	int n1,n2,res;      // function defination
	printf("Enter a number");
	scanf("%d%d",&n1,&n2);
	res=n1+n2;
	
	
	
}
