#include<stdio.h>
void evenodd(); //declartion
void main(){
	evenodd(); // function call
	
}
void evenodd(){
	int num;
	printf("Enter a number"); // definition
	scanf("%d",&num);
	
	if(num%2==0)
	{
		printf("Even");
	}
	else{
		printf("odd");
	}
}

