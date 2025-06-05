void main(){
	int hh,min,sec,totalSecond;
	printf("Enter hours");
	scanf("%d",&hh);
	printf("Enter minute");
	scanf("%d",&min);
	printf("Enter second");
	scanf("%d",&sec);
	
	totalSecond= hh*60*60 + min*60 +sec;
	printf("Total second %d\n",totalSecond);
}
