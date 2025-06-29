#include<stdio.h>
void leapYear(int*);
void main()
{   int year=2003;
	leapYear(&year);  // call
}
void leapYear(int* year){    // defination
	
	if(*year%4==0 && *year%100!=0 || *year%400==0){
		printf("Leap year");
	}
	else{
		printf("Not leap year");
	}
}
