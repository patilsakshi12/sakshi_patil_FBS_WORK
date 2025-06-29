int add();
int subtract(int,int);
int multiply(int,int);
int divide(int,int);
int modulus(int,int);
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
	int res =add(n1,n2);
	printf("Addtion of two number is =%d",res);
   }
	else if(op =='-')
	{
	int res=subtract(n1,n2);
	printf("Substraction=%d",res);
	
    }
	else if(op == '*')
	{
	int res = multiply(n1,n2);
	printf("Multiply = %d",res);
   }
   else if(op == '/')
   {
   int res=divide(n1,n2);
   if(res==1)
   printf("Divide = %d",res);
   else
   printf(" Error modulus zero not allowed");
   }
	else if(op == '%')
	{
   int res=modulus(n1,n2);
   if(res==1)
   printf("Modulus = %d",res);
   else
   printf(" Error modulus zero not allowed");
   }
	else
	printf("Invalid choice");
}
 // fuction defination
 int add(int n1,int n2)
 {
     return n1+n2;
 	
 }
 
int subtract(int n1,int n2)
 {
 	n1-n2;
 	 return n1-n2;
 	
 }
 
 int multiply(int n1,int n2)
 {
 	return n1*n2;

 	
 }
 
 int divide(int n1,int n2)
 {


 	if(n2!=0)
	   {
	
	    return n1/n2;
	    
       }
	    else
	     return 0;
	
 }
 
 int modulus(int n1,int n2)
 {
 	int res;
 	if(n2!=0)
	   {
	
	     return n1%n2;
	    
	     
       }
	    else
	     return 0;
	
 }
 
