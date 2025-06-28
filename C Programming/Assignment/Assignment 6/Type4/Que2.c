#include<stdio.h>
void main(){
	int n=348;
	int res=checkPalindrome(348);
	if(res==1)
	printf("palindrome number");
	else
	printf("Not palindrome");
}
int checkPalindrome(int n)
{
	int r1,r2,r3,q1,rev;
	r1= n%10;
	q1=n/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
    if(rev==n)
    return 1;
    else
    return 0;
  
}
