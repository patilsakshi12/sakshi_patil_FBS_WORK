#include<stdio.h>
void evenodd(int);
void primeCheck(int);
void palindrome(int);
void posNeg(int);
void reverseNum(int);
void sumOfDigit(int);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	int choice;
	printf(" Menu:\n");
	printf("1. check Even or Odd\n");
	printf("2. check Prime or Not\n");
	printf("3. check Palindrome or Not\n");
	printf("4. check Positive, Negative or Zero\n");
	printf("5. Reverse the number\n");
	printf("6. Sum of Digits\n");
	
	printf("Enter a choice");
	scanf("%d",&choice);
	
	if(choice==1)
	 evenodd(n);
	else if(choice==2)
	 primeCheck(n);
	else if(choice==3)
	 palindrome(n);
	else if(choice==4)
	 posNeg(n);
	else if(choice==5)
	  reverseNum(n);
	else if(choice==6)
	   sumOfDigit(n);
	else
	printf("Invalid choice");
}
void evenodd(int n)
{
	
	if(n%2==0)
	printf("Even");
	else
	printf("Odd");
}
void primeCheck(int n)
{
	int flag=0;
	int i;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	printf("prime");
	else
	printf("Not prime");
}
void palindrome(int n)
{
	
    int rev=0;
    int rem;
    int temp=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==temp)
	printf("Palindrome");
	else
	printf("Not Palindrome");
}
void posNeg(int n)
{

	if(n>0)
	printf("positive");
	else if(n<0)
	printf("Negative");
	else
	printf("Zero");
}
void reverseNum(int n)
{
	
	int rev=0,rem;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	printf(" reverse %d",rev);
}
void sumOfDigit(int n)
{
	
	int rem,sum=0;
	for(;n>0;n=n/10)
	{
		rem=n%10;
		sum=sum+rem;
	}
	printf("Sum = %d",sum);
}
