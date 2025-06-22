#include<stdio.h>
void totalSalary(); // declare
void main(){
	totalSalary(); // call
}
void totalSalary() // defination
{
	double basic=1500, da,ta,hra,total;
	if(basic<=5000){
		da=basic*0.10;
		ta=basic*0.20;
		hra=basic*0.25;
	}
	else{
		da=basic*0.15;
		ta=basic*0.25;
		hra= basic*0.30;
	}
	 total=basic+da+ta+hra;
	printf("total salary is %.2lf",total);
}
