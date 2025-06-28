#include<stdio.h>
int leapYear(int);
void main(){
	int year;
	printf("Enter a year");
	scanf("%d",&year);
	int res=leapYear(year);
	if(res==1)
	printf("Leap year");
	else
	printf("Not leap year");
}
int leapYear(int year)
{

	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
	return 0;
}
