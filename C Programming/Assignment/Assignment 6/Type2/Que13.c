#include<stdio.h>
int Checkage();   //declare
void main(){
int res=Checkage(); // call
if(res==1)
printf("You are a Child");
else if(res==2)
printf("You are a Teenager");
else if(res==3)
printf("You are a Adult");
else if(res==4)
	printf("You are senior");
else
printf("Invalid age");


}


int Checkage(){  // defination

	int age;
	printf("Enter your age");
	scanf("%d",&age);
	
	if(age<12)
	return 1;
	else if(age>=12 && age<=19)
	return 2;
	else if(age>=20 && age<=59)
	return 3;
	else if(age>=60)
	return 4;
	else
	return 0;
	
}
