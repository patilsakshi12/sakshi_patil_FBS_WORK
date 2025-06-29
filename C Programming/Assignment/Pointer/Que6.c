#include<stdio.h>
char Upperlowercase(char*); // declare
void main()
{   	char ch='h';
	char res=Upperlowercase(&ch);//call
	if(res=='U')
		printf("Upper case");
	else
	    printf("Lower case");
}
char Upperlowercase(char* choice) // defination
{
	
	if(*choice>='A' && *choice<='Z'){
		return 'U';
	
	}
	else{
		return 'L';
	}
	
}
