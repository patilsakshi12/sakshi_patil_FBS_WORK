#include<stdio.h>
struct Distance{
	int feet;
	int inch;

};
void main()
{
	struct Distance d1,d2;
	
	
	printf("Enter Distance(feet inch)");
	scanf("%d%d",&d1.feet,&d1.inch);
	
	printf("Enter Distance(feet inch)");
	scanf("%d%d",&d2.feet,&d2.inch);
	
   	printf("Distance:%d ft %d in\n",d1.feet,d1.inch);
   	printf("Distance:%d ft %d in\n",d2.feet,d2.inch);
	
}
