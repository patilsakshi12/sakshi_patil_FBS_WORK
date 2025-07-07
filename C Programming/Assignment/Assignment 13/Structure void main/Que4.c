#include<stdio.h>
#include<string.h>
struct HR{
	int id;
	char name[20];
	double salary;
	double commission;
};
void main()
{
	

	struct HR h1,h2;
	h1.id=101;
	strcpy(h1.name,"Neha");
	h1.salary=40000;
	h1.commission=2000;
	
	printf("\nEnter Id Name  Salary and commission");
	scanf("%d%s%lf%lf",&h2.id,h2.name,&h2.salary,&h2.commission);
	
	printf("\n Id= %d name= %s salary= %.2lf commission= %.2lf",h1.id,h1.name,h1.salary,h1.commission);
	printf("\n Id= %d name= %s salary= %.2lf commission= %.2lf",h2.id,h2.name,h2.salary,h2.commission);

}
