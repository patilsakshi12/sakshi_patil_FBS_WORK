#include<stdio.h>
int perfect();
void main()
{
	int res=perfect();
	if(res==1)
	printf("Perfect number");
	else
	printf("Not Perfect number");
}
int perfect()
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
	return 1;
	else
	return 0;
}
