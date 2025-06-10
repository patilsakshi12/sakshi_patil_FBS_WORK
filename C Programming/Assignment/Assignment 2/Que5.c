void main(){
	double price, discount;
	char isstudent;
	printf("Enter the price");
	scanf("%lf",&price);
	printf("Are you student (Y/N)");
	scanf(" %c",&isstudent);
	
	if(isstudent== 'y' || isstudent== 'Y'){
		if(price> 500)
		{
			discount= price*0.20;
		}
		else
		{
			discount= price*0.10;
		}
	}
	else
	{
		if(price>600)
		{
			discount = price*0.15;
		}
		else
		{
			discount = 0;
		}
	}
	printf("Discount = %.2lf\n",discount);
	printf("Final amount to pay: %.2lf",price-discount);
}
