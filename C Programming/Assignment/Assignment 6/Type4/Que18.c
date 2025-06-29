#include<stdio.h>
int perfect(int);
void main()
{
	int num;
	printf("Enter a number");
	scanf("%d",&num);
	int res=perfect(num);
	if(res==1)
	printf("Perfect number");
	else
	printf("Not Perfect number");
}
int perfect(int num)
{
	int i=1,sum=0;
	
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
