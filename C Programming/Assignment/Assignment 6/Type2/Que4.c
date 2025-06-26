#include<stdio.h>
int EligibleVote(); //declartion
void main()
{  int res;
   res=EligibleVote(); //call
   if(res==1)
   printf("Eligible for vote");
   else
   printf("Not Eligible for vote");
   
}
int EligibleVote() //defination
{
	int age;
	printf("Enter a age");
	scanf("%d",&age);
	if(age>=18)
	  return 1;
	else
	 return 0;
}
