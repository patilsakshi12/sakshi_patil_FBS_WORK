#include<stdio.h>
#include<string.h>
struct SalesManager{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
};
void main()
{
	

	struct SalesManager s1,s2;
	s1.id=101;
	strcpy(s1.name,"Neha");
	s1.salary=40000;
	s1.incentive=2000;
	s1.target=20;
	
	
	printf("\nEnter Id Name  Salary incentive and target");
	scanf("%d%s%lf%lf%d",&s2.id,s2.name,&s2.salary,&s2.incentive,&s2.target);
	
	printf("\n Id= %d name= %s salary= %.2lf incentive= %.2lf target= %d",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
	printf("\n Id= %d name= %s salary= %.2lf commission= %.2lf",s2.id,s2.name,s2.salary,s2.incentive,s2.target);

}
