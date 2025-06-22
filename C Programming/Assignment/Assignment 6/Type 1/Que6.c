#include<stdio.h>
void Upperlowercase(); // declare
void main()
{
	Upperlowercase();//call
}
void Upperlowercase() // defination
{
		char ch='N';
	if(ch>='A' && ch<='Z'){
		printf("Upper case");
	}
	else{
		printf("Lower case");
	}
	
}
