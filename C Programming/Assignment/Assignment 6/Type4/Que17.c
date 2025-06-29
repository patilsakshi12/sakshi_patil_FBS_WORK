#include<stdio.h>
int checkArmstrong(int); //declare
void main()
{
      int res=checkArmstrong(153);	
      if(res==1)
      printf("Number Armstrong");
      else
      printf("Number Not Armstron");
}
int checkArmstrong(int num){

	int rem, sum=0;
	int temp=num;
	while(num>0){
	   rem=num%10;
	   sum=sum+(rem*rem*rem);
	   num=num/10;
	}
	
	if(sum==temp)
	return 1;
	else
	return 0;
}
