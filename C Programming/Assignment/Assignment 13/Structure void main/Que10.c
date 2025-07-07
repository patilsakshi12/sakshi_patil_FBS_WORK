#include<stdio.h>
#include<string.h>
struct Product{
	int id;
	char name[20];
	int quantity;
	float price;
};
void main()
{
	struct Product p1,p2;
	p1.id=101;
	strcpy(p1.name,"Sakshi");
	p1.quantity= 12;
	p1.price=35056;
	
	printf("\nEnter Id name quantity and price");
	scanf("%d%s%d%f",&p2.id,p2.name,&p2.quantity,&p2.price);
	
printf("\nId= %d name= %s quantity= %d price= %.2f",p1.id,p1.name,p1.quantity,p1.price);
printf("\nId= %d name= %s quantity= %d price= %.2f",p2.id,p2.name,p2.quantity,p2.price);
}
