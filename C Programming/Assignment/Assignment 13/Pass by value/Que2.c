#include<stdio.h>
struct Employee{
	int id;
	char name[20];
	double salary;
};
struct Employee storeEmployee();
void display(struct Employee );
void main()
{
	struct Employee e1,e2;
	printf("Enter Employee 1 details");
        e1=storeEmployee();
	
	printf("\nEnter Employee 2 details");
	e2=storeEmployee();
	
	printf("\nEmployee 1 details");
    display(e1);
	printf("\nEmployee 2 details");
	display(e2);
}
struct Employee storeEmployee()
{
	struct Employee e1;
	printf("\nEnter id name and salary");
	scanf("%d%s%lf",&e1.id,e1.name,&e1.salary);
	return e1;
}
void display(struct Employee temp)
{
		printf("\nid= %d name= %s salary= %.2lf",temp.id,temp.name,temp.salary);
	
}
