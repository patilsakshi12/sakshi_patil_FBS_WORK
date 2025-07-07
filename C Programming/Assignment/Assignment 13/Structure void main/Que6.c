#include<stdio.h>
struct Date{
	int date;
	int month;
	int year;
};
void main()
{
	struct Date d1,d2;
	d1.date=10;
	d1.month=9;
	d1.year=2002;
	
	printf("Enter Date(dd mm yyyy)");
	scanf("%d%d%d",&d2.date,&d2.month,&d2.year);
	printf("Date: %02d/%02d/%d",d1.date,d1.month,d1.year);
	printf("\nDate: %02d/%02d/%d",d2.date,d2.month,d2.year);
}
