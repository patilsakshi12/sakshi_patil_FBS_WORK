#include<stdio.h>
typedef struct Time{
	int hour;
	int min;
	int sec;
}Time;
Time storeTime();
void display(Time);

void main()
{
	struct Time t1,t2;
	printf("Enter time ");
	t1=storeTime();
	printf("Enter time ");
	t2=storeTime();
	display(t1);
	display(t2);
	
	
	
}
Time storeTime()
{
	Time t2;
	printf("Enter Date(hh mm ss)");
	scanf("%d%d%d",&t2.hour,&t2.min,&t2.sec);
	return t2;
}
void display(Time t1)
{
		printf("Time: %02d:%02d:%02d",t1.hour,t1.min,t1.sec);
}
