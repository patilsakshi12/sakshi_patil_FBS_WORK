#include<stdio.h>
double totalSalary(double); // declare
void main(){
	double basic;
	printf("Enter a basic salary");
	scanf("%lf",&basic);
  double res=totalSalary(basic); // call
  printf("total salary is %.2lf",res);
}
double totalSalary(double basic) // defination
{
	double da,ta,hra,total;
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
