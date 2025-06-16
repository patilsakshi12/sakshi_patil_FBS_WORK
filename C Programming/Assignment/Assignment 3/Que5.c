#include<stdio.h>
void main()
{
	int num=153, rem, sum=0;
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
