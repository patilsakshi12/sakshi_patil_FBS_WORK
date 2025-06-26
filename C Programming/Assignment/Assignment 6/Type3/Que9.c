#include<stdio.h>
void checkGreatest(int,int,int); // declaration

void main(){
	int a,b,c;
	printf("Enter three number:");
	scanf("%d%d%d",&a,&b,&c);
	 checkGreatest(a,b,c); //call
}

void checkGreatest(int a,int b,int c)
{  // defination
		
	
	if(a>b){
		if(a>c)
		printf("%d is greatest number",a);
		else
		printf("%d is greatest number",c);
		
	}
	else{
		if(b>c)
		printf("%d is greatest number",b);
		else
		printf("%d is greatest number",c);
		
	}
}
