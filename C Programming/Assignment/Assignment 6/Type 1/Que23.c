#include<stdio.h>
void palindrome();
void main()
{
	palindrome();
}
void palindrome()
{

	int num,rem, rev=0;
	printf("Enter a number");
	scanf("%d",&num);
	int temp=num;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(rev==temp)
	printf("number is Palindrome");
	else
	printf("number is not palindrome");
	
	
}
