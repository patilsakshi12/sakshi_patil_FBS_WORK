#include<stdio.h>
double SellingPrice(double,double);
void main()
{
	double cost,discount;
	printf("Enter a cost");
	scanf("%lf",&cost);
	printf("Enter discount");
	scanf("%lf",&discount);
 double sp=SellingPrice(cost,discount);
 printf("Selling price %.2lf",sp);
}
double SellingPrice(double cost,double discount)
{
	double sp;
	if(discount>0)
	{
		if(discount<=cost)
		    sp=cost-discount;
		else
		  sp=cost;
	}
	else
	{
		sp=cost;
	}
	return sp;
}
