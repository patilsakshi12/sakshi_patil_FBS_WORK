#include<stdio.h>
int checkGreatest(); // declaration

void main(){
	int res= checkGreatest(); //call
	printf("%d is the greatest number\n",res);
}

int checkGreatest()
{  // defination
		int a,b,c;
	printf("Enter three number:");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>b){
		if(a>c)
		return a;
		else
		return c;
		
	}
	else{
		if(b>c)
		return b;
		else
		return c;
		
	}
}
