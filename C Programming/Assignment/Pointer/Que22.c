#include<stdio.h>
void checkStrong(int*);
void main()
{
	int num;
	printf("Enter a number");
	scanf("%d",&num);
	checkStrong(&num); // call
}
void checkStrong(int* n)
{

	int rem,sum=0;
	int temp=*n;
	while(*n>0){
		rem=*n%10;
		int fact=1;
		while(rem>=1){
			fact=fact*rem;
			rem--;
		}
		sum=sum+fact;
		*n=*n/10;
	}
	if(sum==temp)
	printf("Strong no");
	else
	printf("Not strong no");
	
	
}
