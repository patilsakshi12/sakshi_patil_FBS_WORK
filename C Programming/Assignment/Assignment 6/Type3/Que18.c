#include<stdio.h>
void checkArmstrong(int); //declare
void main()
{
	  int n;
	  printf("Enter a number");
	  scanf("%d",&n);
      checkArmstrong(n);	
}
void checkArmstrong(int num){

	int rem, sum=0;
	int temp=num;
	while(num>0){
	   rem=num%10;
	   sum=sum+(rem*rem*rem);
	   num=num/10;
	}
	
	if(sum==temp)
	printf("Armstrong no");
	else
	printf("Not Armstrong");
}
