#include<stdio.h>
int printNumber();
void main()
{
int count=printNumber(); // call
printf("\nTotal number printed %d ",count);
}
int printNumber()
{

   int num, i=1;
   printf("Enter a Number");
   scanf("%d",&num);
   while(i<=num)
   {
   	printf("%d ",i);
   	i++;
   }
   return num;
}
