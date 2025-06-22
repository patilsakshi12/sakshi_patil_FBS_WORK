#include<stdio.h>
void Vowel(); // declartion
void main()
{
	Vowel(); //call
}
void Vowel()     // defination
{
	char ch='B';
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
		printf("Vowel");
	}
	else{
		printf("consont");
	}

	
}
