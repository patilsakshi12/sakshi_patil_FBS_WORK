#include<stdio.h>
void main(){
	int n;
	printf("Enter a number");
	scanf("%d",&n);
	int res=evenodd(n);
	if(res==1)
	printf("even");
	else
	printf("Odd");
}
int evenodd(int n)
{
    if(n%2==0)
	return 1;
	else
	return 0;	
}
