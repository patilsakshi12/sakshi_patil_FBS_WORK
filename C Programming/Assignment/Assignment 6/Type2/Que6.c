#include<stdio.h>
double totalSalary(); // declare
void main(){
    double salary;	
	salary=totalSalary(); // call
	printf("total salary is %.2lf",salary);
}
double totalSalary() // defination
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
	 return total;
}
