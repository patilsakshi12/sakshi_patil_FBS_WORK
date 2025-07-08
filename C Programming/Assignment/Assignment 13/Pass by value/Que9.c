#include<stdio.h>
typedef struct Complex{
	int real;
	int imaginary;
}Complex;
Complex storeComplex();
void display(Complex);
void main()
{
	struct Complex c1,c2;
	
    c1=storeComplex();
    c2=storeComplex();
    display(c1);
    display(c2);
	
	
}
Complex storeComplex()
{
	Complex c1;
	printf("Enter real and imaginary Number");
	scanf("%d%d",&c1.real,&c1.imaginary);
	return c1;
}
void display(Complex c1)
{
	printf("Complex number:%d+%di\n",c1.real,c1.imaginary);
}
