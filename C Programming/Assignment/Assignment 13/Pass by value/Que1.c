#include<stdio.h>
#include<string.h>
struct student{
	int rollno;
	char name[20];
	int marks;
};
 struct student storeStudent();
 void display(struct student );
void main()
{
	struct student s1,s2,s3,s4,s5;
    printf("Enter student 1 details");
    s1 = storeStudent();	
    printf("Enter student 2 details");
    s2= storeStudent();	
    printf("Enter student 3 details");
     s3= storeStudent();
    printf("Enter student 4 details");
     s4= storeStudent();	
	printf("Enter student 5 details");
     s5= storeStudent();	
	
	printf("---------Student 1 details--------\n");
     display(s1);
	

	
	printf("-----------Student 2 details--------------\n");
	 display(s2);
	
	printf("-----------Student 3 details--------------\n");
   display(s3);
	
	printf("-----------Student 4 details--------------\n");
	display(s4);
	
	printf("-----------Student 5 details--------------\n");
	display(s5);
}
 struct student storeStudent()
{
	struct student s1;
	printf("\nEnter a rollno\n");
	scanf("%d",&s1.rollno);
	printf("Enter a name\n");
	scanf("%s",s1.name);
	printf("Enter a marks\n");
	scanf("%d",&s1.marks);
	return s1;
}
void display(struct student s1)
{
	
	printf("roll no %d\n",s1.rollno);
	printf("Student name %s\n",s1.name);
	printf("Marks %d\n",s1.marks);
	
	
}
