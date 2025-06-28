#include<stdio.h>
char Vowel(char); // declartion
void main()
{
	char ch;
	char res=Vowel('u'); //call
	if(res=='V')
	printf("vowel");
	else
	printf("Consont");
}
char Vowel(char ch)     // defination
{
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	return 'V';
	

	else
	return 'C';

	
}
