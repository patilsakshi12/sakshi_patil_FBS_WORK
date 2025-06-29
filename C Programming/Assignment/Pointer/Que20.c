#include<stdio.h>
void isPerfect(int*);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	isPerfect(&n);
}
void isPerfect(int* num)
{
	int i=1,sum=0;
	while(i<*num)
	{
		if(*num%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(sum==*num)
	printf("Number is perfect");
	else
	printf("Numbet is not perfect");
}
