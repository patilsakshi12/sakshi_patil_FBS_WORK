#include<stdio.h>
int checkStrong(int);
void main()
{
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	int res=checkStrong(n); // call
	if(res==1)
	printf("Strong no");
	else
	printf("Not strong no");
}
int 
checkStrong(int n)
{

	int  rem,sum=0;
	
	int temp=n;
	while(n>0){
		rem=n%10;
		int fact=1;
		while(rem>=1){
			fact=fact*rem;
			rem--;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum==temp)
	return 1;
	else
	return 0;
	
	
}
