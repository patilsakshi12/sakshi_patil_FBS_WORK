#include<stdio.h>
void checkTriangle();
void main()
{
	checkTriangle();
	checkTriangle(); //call
}

void checkTriangle()
{

   int s1,s2,s3;
   printf("Enter the three side of triangle:");
   scanf("%d%d%d", &s1,&s2,&s3);
   if(s1==s2 && s2==s3)
   {
   	printf("Equilateral triangle\n");
   }
   else if(s1==s2 || s2==s3 || s1==s3){
   printf("Isosceles triangle\n");
  }
  else
   printf(" Scalene triangle\n");
	
   
}
