#include<stdio.h>
void add();
void subtract();
void multiply();
void divide();
void modulus();
void main()
{
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
	add();
   }
	else if(op =='-')
	{
	subtract();
    }
	else if(op == '*')
	{
	multiply();
   }
   else if(op == '/')
   {
	divide();
   }
	else if(op == '%')
	{
	modulus();
   }
	else
	printf("Invalid choice");
}
 // fuction defination
 void add()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	res= n1+n2;
 	printf("Addition =%d\n",res);
 	
 }
 
void  subtract()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	res=n1-n2;
 	printf("Subtract = %d\n",res);
 }
 
 void multiply()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	res=n1*n2;
 	printf("Multiply = %d\n",res);
 }
 
 void divide()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	if(n2!=0)
	   {
	
	    res= n1/n2;
	     printf("Divide = %d\n",res);
       }
	    else
	     printf(" Error modulus zero not allowed");
	
 }
 
 void modulus()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	if(n2!=0)
	   {
	
	    res= n1%n2;
	     printf("modulus = %d\n",res);
       }
	    else
	     printf(" Error modulus zero not allowed");
	
 }
 
