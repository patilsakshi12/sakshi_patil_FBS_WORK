#include<stdio.h>
int EligibleVote(int); //declartion
void main()
{  int age;
printf("Enter a age");
scanf("%d",&age);
   int res=EligibleVote(age); //call
   if(res==1)
   printf("Eligibal for vote");
   else
   	printf("Not Eligibal for vote");
}
int EligibleVote(int age) //defination
{
	
	if(age>=18){
		return 1;
	}
	else{
	return 0;
	}
}
