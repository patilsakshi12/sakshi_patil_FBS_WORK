#include<stdio.h>
void digit(int); // declaration
void main(){
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	digit(n);
	 //function call
}
void digit(int n){    // function defination
    
	int rev;
	int r1,r2,r3,q1;
	r1= n%10;
	q1=n/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
    
    if(rev==n)
    	printf("Palindrome no\n");
	
	else
		printf("Not palindrome \n");
	
  
}
