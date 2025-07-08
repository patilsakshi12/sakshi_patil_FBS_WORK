#include<stdio.h>

typedef struct Product{
	int id;
	char name[20];
	int quantity;
	float price;
}Product;
Product storeProduct();
void display(Product p1);
void main()
{
	struct Product p1,p2;
	
	printf("Enter Product 1 details");
	p1=storeProduct();
	printf("Enter Product 2 details");
	p1=storeProduct();
	 
	printf("Product 1 details");
    display(p1);
    printf("Product 2 details");
    display(p2);
    
    
}
Product storeProduct()
{
	Product p2;
	printf("\nEnter Id name quantity and price");
	scanf("%d%s%d%f",&p2.id,p2.name,&p2.quantity,&p2.price);
	return p2;
	
}
void display(Product p1)
{
	
printf("\nId= %d name= %s quantity= %d price= %.2f",p1.id,p1.name,p1.quantity,p1.price);

}
