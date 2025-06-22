#include<stdio.h>
int leapYear();  // declare
void main()
{
  int res;
  res=leapYear();  // call
  if(res==1)
  printf("Leap Year");
  else
  printf("Not leap year");
}
int leapYear(){    // defination
	int year;
	printf("Enter a year");
	scanf("%d",&year);
	if(year%4==0 && year%100!=0 || year%400==0)
	    return 1;
	else
	    return 0;
}
