#include<stdio.h>
void evenodd(int*); //declartion
void main(){
	int num;
	printf("Enter a number"); // definition
	scanf("%d",&num);
	evenodd(&num); // function call
	
}
void evenodd(int* num){ //defination
	
	if(*num%2==0)
	{
		printf("Even");
	}
	else{
		printf("odd");
	}
}

