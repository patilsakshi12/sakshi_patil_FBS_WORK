#include<stdio.h>
int checkTriangle();
void main()
{
	int res=checkTriangle();
	if(res==1)
	printf("Equilateral Triangle\n");
	else if(res==2)
	printf("Isoscales Triangle\n");
	else
	printf("Scalene triangle\n");
	
}

int checkTriangle()
{

   int s1,s2,s3;
   printf("Enter the three side of triangle:");
   scanf("%d%d%d", &s1,&s2,&s3);
   if(s1==s2 && s2==s3)
    return 1;
   else if(s1==s2 || s2==s3 || s1==s3)
    return 2;
  else
   return 0;
	
   
}
