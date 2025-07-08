#include<stdio.h>
typedef struct Distance{
	int feet;
	int inch;

}Distance;
Distance storeDistance();
void display(Distance);
void main()
{
	struct Distance d1,d2;
	
	d1=storeDistance();
	d2=storeDistance();
	display(d1);
	display(d2);
    
	
}
Distance storeDistance()
{
	Distance d1;
	printf("Enter Distance(feet inch)");
	scanf("%d%d",&d1.feet,&d1.inch);
	
}
void display(Distance d1)
{
	
	
   	printf("Distance:%d ft %d in\n",d1.feet,d1.inch);
   	
}

