#include<stdio.h>
void main(){
	int num, i=1,sum=0;
	printf("Enter a number");
	scanf("%d",&num);
	while(i<num)
	{
		if(num%i==0){
			sum=sum+i;
		}
	i++;
	}
	if(num==sum)
	printf("Perfect number");
	else
	printf("Not perfect number");
}
