#include<stdio.h>
void EligibleVote(); //declartion
void main()
{ 
   EligibleVote(); //call
}
void EligibleVote() //defination
{
	int age =10;
	if(age>=18){
		printf("Eligibal for vote");
	}
	else{
		printf("Not Eligibal for vote");
	}
}
