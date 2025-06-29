#include<stdio.h>
void palindrome(int* );
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	palindrome(&n);
}
void palindrome(int* num)
{

	int rem, rev=0;

	int temp=*num;
	while(*num>0){
		rem=*num%10;
		rev=rev*10+rem;
		*num=*num/10;
	}
	if(rev==temp)
	printf("number is Palindrome");
	else
	printf("number is not palindrome");
	
	
}
