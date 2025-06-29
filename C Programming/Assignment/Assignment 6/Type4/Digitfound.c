#include<stdio.h>
void main()
{
	int n=123456;
	int dig=8;
	int res=findDigit(n,dig);
	if(res== 1)
	printf("Digit found");
	else
	printf("Digit not found");
}
int findDigit(int n,int digit)
{
	int i=0,rem;
    while(n>0)
    {
    rem=n%10;
    if(rem==digit)
    return 1;
    n=n/10;
   }
   return 0;
}
