#include<stdio.h>
void Upperlowercase(char); // declare
void main()
{   	char ch;
	Upperlowercase('h');//call
}
void Upperlowercase(char choice) // defination
{
	
	if(choice>='A' && choice<='Z'){
		printf("Upper case");
	}
	else{
		printf("Lower case");
	}
	
}
