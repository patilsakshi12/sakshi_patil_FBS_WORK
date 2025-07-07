#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	int marks;
};
void main()
{
	struct student s1,s2;
	s1.rollno=101;
	strcpy(s1.name,"Sakshi");
	s1.marks=98;
	
	printf("\nEnter rollno name marks");
	scanf("%d%s%d",&s2.rollno,s2.name,&s2.marks);
	
printf("\nRollno= %d name= %s marks= %d",s1.rollno,s1.name,s1.marks);
printf("\nRollno= %d name= %s marks= %d",s2.rollno,s2.name,s2.marks);


}

