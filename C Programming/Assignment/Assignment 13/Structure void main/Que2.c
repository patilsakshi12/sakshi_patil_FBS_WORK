#include<stdio.h>
struct Employee
{
	int id;
	char name[20];
	double salary;
	
};
void main()
{
	struct Employee e1,e2;
	e1.id=101;
	strcpy(e1.name,"Neha");
	e1.salary=40000;
	
	printf("\nEnter Id Name and Salary");
	scanf("%d%s%lf",&e2.id,e2.name,&e2.salary);
	
	printf("\n Id= %d name= %s salary= %lf",e1.id,e1.name,e1.salary);
	printf("\n Id= %d name= %s salary= %lf",e2.id,e2.name,e2.salary);
}
