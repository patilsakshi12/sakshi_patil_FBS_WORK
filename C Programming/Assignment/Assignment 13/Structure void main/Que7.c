#include<stdio.h>
struct Time{
	int hour;
	int min;
	int sec;
};
void main()
{
	struct Time t1,t2;
	t1.hour=19;
	t1.min=45;
	t1.sec=35;
	
	printf("Enter Date(hh mm ss)");
	scanf("%d%d%d",&t2.hour,&t2.min,&t2.sec);
	printf("Time: %02d:%02d:%02d",t1.hour,t1.min,t1.sec);
	printf("\nTime: %02d:%02d:%02d",t2.hour,t2.min,t2.sec);
}
