#include<stdio.h>
typedef struct Date{
	int date;
	int month;
	int year;
}Date;
Date storeDate();
void display(Date);
void main()
{
	struct Date d1,d2;
	printf("Enter a Date 1");
	d1=storeDate();
	printf("\n Enter a Date 2");
	d2=storeDate();
	
	printf("-----Date------");
	display(d1);
	printf("\n------Date------");
	display(d2);
	
	


}
Date storeDate()
{
	Date d2;
	printf("\nEnter Date(dd mm yyyy)");
	scanf("%d%d%d",&d2.date,&d2.month,&d2.year);
	return d2;
}
void display(Date d1)
{
		printf("\nDate: %02d/%02d/%d",d1.date,d1.month,d1.year);
}
