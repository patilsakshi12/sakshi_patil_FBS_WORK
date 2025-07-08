
#include<stdio.h>
typedef struct SalesManager{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
}SalesManager;
SalesManager store();
void display(SalesManger);
void main()
{
	

	struct SalesManager s1;
	
    printf("Enter 1 SalesManager details");
    s1=store();
	

	printf("SalesManager details");
    display(s1);
}
SalesManager store()
{
	   SalesManager s2;
	printf("\nEnter Id Name  Salary incentive and target");
	scanf("%d%s%lf%lf%d",&s2.id,s2.name,&s2.salary,&s2.incentive,&s2.target);
	return s2;
	
}
void display(SalesManager s1)
{
		printf("\n Id= %d name= %s salary= %.2lf incentive= %.2lf target= %d",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
}
