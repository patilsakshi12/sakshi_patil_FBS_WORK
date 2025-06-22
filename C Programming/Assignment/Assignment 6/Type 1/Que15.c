#include<stdio.h>
void printNumber();
void main()
{
	printNumber(); // call
}
void printNumber()
{

   int num, i=1;
   printf("Enter a Number");
   scanf("%d",&num);
   while(i<=num)
   {
   	printf("%d ",i);
   	i++;
   }
}
