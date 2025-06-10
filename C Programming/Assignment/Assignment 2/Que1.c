#include<stdio.h>
void main(){
	int n1,n2,res;
	char op;
	printf("Enter Two Number");
	scanf("%d",&n1);
	scanf("%d", &n2);
	printf("Menu:\n");
	printf("Enter + for Addition\n");
	printf("Enter - for Substraction\n");
	printf("Enter * for Multiplication\n");
	printf("Enter / for Division\n");
	printf("Enter %% for Modulus\n");
	printf("Enter your choice");
    fflush(stdin);
	scanf("%c",&op);
	if(op=='+')
	{
     res= n1+n2;
      printf("Result = %d\n",res);
	}
	else if(op=='-')
	{
		res= n1-n2;
		 printf("Result = %d\n",res);
	}
	else if(op=='*')
	{
		res= n1*n2;
		 printf("Result = %d\n",res);
	}
	else if(op=='/')
	{   if(n2!=0)
	   {
	
	    res= n1/n2;
	     printf("Result = %d\n",res);
       }
	    else
	     printf(" Error modulus zero not allowed");
	}
	else if(op=='%')
	{   if(n2!=0)
	    {
		
		res=n1%n2;
		 printf("Result = %d\n",res);
	   }
		else
		printf("Error Modulus zero not allowed");
	}
	else{
		printf("Invalid choice");
	}
	
}
