#include<stdio.h>
void Vowel(char*); // declartion
void main()
{ char ch='U';
	Vowel(&ch); //call
}
void Vowel(char* ch)     // defination
{
	
	if(*ch=='a' || *ch=='e' || *ch=='i' || *ch=='o' || *ch=='u' || *ch=='A' || *ch=='E' || *ch=='I' || *ch=='O' || *ch=='U'){
		printf("Vowel");
	}
	else{
		printf("consont");
	}

	
}
