#include<stdio.h>
#include<math.h>
void main()
{
	int base,exp;
	printf("Enter a base");
	scanf("%d",&base);
	printf("Enter a exponent");
	scanf("%d",&exp);
	int res=pow(base,exp);
	printf("%d^%d=%d",base,exp,res);
}
