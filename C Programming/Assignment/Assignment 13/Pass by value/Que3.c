#include<stdio.h>
struct Admin{
	int id;
	char name[20];
	float salary;
	float allowance;
};
struct Admin storeAdmin();
void display(struct Admin );

void main()
{
	struct Admin a1,a2;

	printf("Enter Admin 1 details");
	a1=storeAdmin();
	printf("Enter Admin 2 details");
	a2=storeAdmin();
	
	printf("Admin 1 details");
	display(a1);
	printf("Admin 2 details");
	display(a2);
	
}
struct Admin storeAdmin()
{
	struct Admin a2;
	printf("\nEnter Id name Salary and allowance");
	scanf("%d%s%f%f",&a2.id,a2.name,&a2.salary,&a2.allowance);
	return a2;
	
}
void display(struct Admin a1)
{
	printf("\nId= %d name= %s salary= %f allowance= %.2f",a1.id,a1.name,a1.salary,a1.allowance);
}

