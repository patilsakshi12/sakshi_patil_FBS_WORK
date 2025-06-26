#include<stdio.h>
int add();
int subtract();
int multiply();
int divide();
int modulus();
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
	int res =add();
	printf("Addtion of two number is",res);
   }
	else if(op =='-')
	{
	int res=subtract();
	printf("Substraction=%d",res);
	
    }
	else if(op == '*')
	{
	int res = multiply();
	printf("Multiply = %d",res);
   }
   else if(op == '/')
   {
   int res=divide();
   if(res==1)
   printf("Divide = %d",res);
   else
   printf(" Error modulus zero not allowed");
   }
	else if(op == '%')
	{
   int res=modulus();
   if(res==1)
   printf("Modulus = %d",res);
   else
   printf(" Error modulus zero not allowed");
   }
	else
	printf("Invalid choice");
}
 // fuction defination
 int add()
 {
    int n1,n2;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	return n1+n2;
 	
 }
 
int subtract()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	 return n1-n2;
 	
 }
 
 int multiply()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	return n1*n2;
 	
 }
 
 int divide()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	if(n2!=0)
	   {
	
	    res= n1/n2;
	     return 1;
       }
	    else
	     return 0;
	
 }
 
 int modulus()
 {
 	int n1,n2,res;
 	printf("Enter two number");
 	scanf("%d%d",&n1,&n2);
 	if(n2!=0)
	   {
	
	     res=n1%n2;
	     return 1;
	     
       }
	    else
	     return 0;
	
 }
 
