#include<stdio.h>
char Vowel(); // declartion
void main()
{
 char res;
 res = Vowel(); //call
	if(res=='v')
	printf("Vowel");
	else
	printf("Consont");
}
char Vowel()     // defination
{
	char ch='A';
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	       return 'v';
	else
	      return 'c';

	
}
