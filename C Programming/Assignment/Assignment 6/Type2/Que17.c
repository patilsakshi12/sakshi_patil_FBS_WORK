#include<stdio.h>
int checkArmstrong(); //declare
void main()
{
      int res=checkArmstrong();	
      if(res==1)
      printf("Number Armstrong");
      else
      printf("Number Not Armstron");
}
int checkArmstrong(){

	int num=153, rem, sum=0;
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
