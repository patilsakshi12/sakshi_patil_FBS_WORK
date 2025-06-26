#include<stdio.h>
char Upperlowercase(); // declare
void main()
{
char res=Upperlowercase();//call
  if(res=='U')
   printf("Upper Case");
  else
   printf("Lower Case");
  
}
char Upperlowercase() // defination
{
		char ch='N';
	if(ch>='A' && ch<='Z')
	   return 'U';
	else
	    return 'L';
	
}
