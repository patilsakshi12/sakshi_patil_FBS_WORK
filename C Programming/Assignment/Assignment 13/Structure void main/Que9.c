#include<stdio.h>
struct Complex{
	int real;
	int imaginary;
};
void main()
{
	struct Complex c1,c2;
	
	printf("Enter real and imaginary Number");
	scanf("%d%d",&c1.real,&c1.imaginary);
	printf("Enter real and imaginary Number");
	scanf("%d%d",&c2.real,&c2.imaginary);
	
   	printf("Complex number:%d+%di\n",c1.real,c1.imaginary);
   	printf("Complex number:%d+%di\n",c2.real,c2.imaginary);
	
}
