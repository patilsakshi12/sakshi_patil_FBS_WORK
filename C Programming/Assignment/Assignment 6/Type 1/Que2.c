#include<stdio.h>
void digit(); // declaration
void main(){
	
	digit();
	 //function call
}
void digit(){    // function defination
    
	int n=343, rev;
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
