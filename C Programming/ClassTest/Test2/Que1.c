#include<stdio.h>
void main()
{
	int units;
	float bill;
	printf("Enter total Electricity units:");
	scanf("%d", &units);
	
	if(units<= 50)
	{
		bill = units *30;
	}
	else if(units<=150)
	{
		bill=50* 30 +(units-50)*40;
	}
	else
	{
		bill = 50*30 +100*40+(units-150)*50;
	}
	printf("Total Electricity Bill %.2f",bill);
}
