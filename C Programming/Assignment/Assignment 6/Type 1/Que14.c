#include<stdio.h>
void Checkage();
void main(){
	Checkage(); // call
}
void Checkage(){

	int age;
	printf("Enter your age");
	scanf("%d",&age);
	
	if(age<12)
	printf("You are a Child");
	else if(age>=12 && age<=19)
	printf("You are a Teenager");
	else if(age>=20 && age<=59)
	printf("You are a Adult");
	else if(age>=60)
	printf("You are senior");
	else
	printf("Invalid age");
	
}
