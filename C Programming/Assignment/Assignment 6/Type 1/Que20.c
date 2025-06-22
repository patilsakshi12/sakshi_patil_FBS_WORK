#include<stdio.h>
void perfect();
void main()
{
	perfect();
}
void perfect()
{
	int num,i=1,sum=0;
	printf("Enter a number");
	scanf("%d",&num);
	while(i<num){
		if(num%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(sum==num)
	printf("Perfect number");
	else
	printf("Not Perfect number");
}
