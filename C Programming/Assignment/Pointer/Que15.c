void printNumber(int*);
void main()
{
	int num;
   printf("Enter a Number");
   scanf("%d",&num);
	printNumber(&num); // call
}
void printNumber(int* num)
{

   int i=1;
   while(i<=*num)
   {
   	printf("%d ",i);
   	i++;
   }
}
