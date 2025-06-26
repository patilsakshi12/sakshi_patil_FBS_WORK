#include<stdio.h>
void add(int,int);
void subtract(int,int);
void multiply(int,int);
void divide(int,int);
void modulus(int,int);
void main()
{
	int n1,n2;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
	char op;

	printf("Menu:\n");
	printf("Enter + for Addition\n");
	printf("Enter - for Substraction\n");
	printf("Enter * for Multiplication\n");
	printf("Enter / for Division\n");
    printf("Enter %% for Modulus\n");
	printf("Enter your choice");
	scanf(" %c",&op);
	if(op =='+')
	{
	add(n1,n2);
   }
	else if(op =='-')
	{
	subtract(n1,n2);
    }
	else if(op == '*')
	{
	multiply(n1,n2);
   }
   else if(op == '/')
   {
	divide(n1,n2);
   }
	else if(op == '%')
	{
	modulus(n1,n2);
   }
	else
	printf("Invalid choice");
}
 // fuction defination
 void add(int a,int b)
 {
 
   int res= a+b;
 	printf("Addition =%d\n",res);
 	
 }
 
void  subtract(int a,int b)
 {

    int res=a-b;
 	printf("Subtract = %d\n",res);
 }
 
 void multiply(int a,int b)
 {
 	int res=a*b;
 	printf("Multiply = %d\n",res);
 }
 
 void divide(int n1,int n2)
 {
 	if(n2!=0)
	   {
	
	    int res= n1/n2;
	     printf("Divide = %d\n",res);
       }
	    else
	     printf(" Error modulus zero not allowed");
	
 }
 
 void modulus(int n1,int n2)
 {
 	
 	if(n2!=0)
	   {
	
	    int res= n1%n2;
	     printf("modulus = %d\n",res);
       }
	    else
	     printf(" Error modulus zero not allowed");
	
 }
 
