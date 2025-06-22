#include<stdio.h>
void checkStrong();
void main()
{
	checkStrong(); // call
}
void checkStrong()
{

	int n, rem,sum=0;
	printf("Enter a number");
	scanf("%d",&n);
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
	printf("Strong no");
	else
	printf("Not strong no");
	
	
}
