#include<stdio.h>
int evenodd(); //declartion
void main(){
	int res;
	res=evenodd(); // function call
	if(res==1)
	printf("Number is even");
	else
	printf("Number is odd");
	
}
int evenodd(){
	int num;
	printf("Enter a number"); // definition
	scanf("%d",&num);
	
	if(num%2==0)
	 return 1;
	else
	 return 0;
}

