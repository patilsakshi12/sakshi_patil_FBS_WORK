#include<stdio.h>
void leapYear();
void main()
{   
	leapYear();  // call
}
void leapYear(){    // defination
	int year=2003;
	if(year%4==0 && year%100!=0 || year%400==0){
		printf("Leap year");
	}
	else{
		printf("Not leap year");
	}
}
