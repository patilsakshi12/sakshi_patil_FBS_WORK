#include<stdio.h>
int digit(); // declaration
void main(){
 int res=digit(); //function call
   if(res==1)
   printf("Palindrome number");
   else
   printf("Not Palindrome Number");
}
int digit(){    // function defination

	int n=121, rev;
	int r1,r2,r3,q1;
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
