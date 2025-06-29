#include<stdio.h>
int isArmstrong(int);
int getCount(int);
int power(int,int);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	int res=isArmstrong(n);
	if(res==1)
	printf("Armstrong number");
	else
	printf("Not Armstrong");
}
int isArmstrong(int n)
{
	int rem,sum=0;
	int temp=n;
	int count=getCount(n);
	
	while(n>0)
	{
		rem=n%10;
	
	sum=sum+pow(rem,count);
	n=n/10;
  }

	if(sum==temp)
	return 1;
	else
	return 0;
}
int getCount(int n)
{ 
    int count=0;
	while(n>0)
	{
		count++;
		n=n/10;
	}
	return count;
}
/*int power(int rem,int count)
{
	int res=1;
		int i;
		for(i=1;i<=count;i++)
		{
			res=res*rem;
		}
		return res;
}*/
