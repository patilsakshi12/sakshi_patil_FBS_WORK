#include<stdio.h>
int printNumber(int);
void main()
{
	int num;
 printf("Enter a Number");
 scanf("%d",&num);
int count=printNumber(num); // call
printf("\nTotal number printed %d ",count);
}
int printNumber(int num)
{

   int  i=1;
  
   while(i<=num)
   {
   	printf("%d ",i);
   	i++;
   }
   return num;
}
