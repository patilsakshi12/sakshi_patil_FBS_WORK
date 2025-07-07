#include<stdio.h>
#include<string.h>
struct Admin{
	int id;
	char name[20];
	float salary;
	float allowance;
};
void main()
{
	struct Admin a1,a2;
	a1.id=101;
	strcpy(a1.name,"Sakshi");
	a1.salary=98000.76;
	a1.allowance=3500;
	
	printf("\nEnter Id name Salary and allowance");
	scanf("%d%s%f%f",&a2.id,a2.name,&a2.salary,&a2.allowance);
	
printf("\nId= %d name= %s salary= %f allowance= %f",a1.id,a1.name,a1.salary,a1.allowance);
printf("\nId= %d name= %s salary= %f  allowance= %f",a2.id,a2.name,a2.salary,a2.allowance);
}
