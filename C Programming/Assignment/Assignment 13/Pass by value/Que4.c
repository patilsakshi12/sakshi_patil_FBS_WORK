#include<stdio.h>
#include<string.h>
typedef struct HR{
	int id;
	char name[20];
	double salary;
	double commission;
}HR;
HR storeHR();
void display(HR);

void main()
{
	

	 HR h1,h2;
	printf("Enter HR 1 details");
	h1=storeHR();
	printf("Enter HR 2 details");
	h2=storeHR();
	
	printf("HR 1 details");
	display(h1);
	printf("\nHR 2 details");
	display(h2);

}
HR storeHR()
{
	HR h2;
	printf("\nEnter Id Name  Salary and commission");
	scanf("%d%s%lf%lf",&h2.id,h2.name,&h2.salary,&h2.commission);
	return h2;
}
void display(HR h1)
{
	printf("\n Id= %d name= %s salary= %.2lf commission= %.2lf",h1.id,h1.name,h1.salary,h1.commission);
}
