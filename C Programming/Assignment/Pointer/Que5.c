#include<stdio.h>
void EligibleVote(int*); //declartion
void main()
{  int age;
printf("Enter a age");
scanf("%d",&age);
   EligibleVote(&age); //call
}
void EligibleVote(int* age) //defination
{
	
	if(*age>=18){
		printf("Eligibal for vote");
	}
	else{
		printf("Not Eligibal for vote");
	}
}
