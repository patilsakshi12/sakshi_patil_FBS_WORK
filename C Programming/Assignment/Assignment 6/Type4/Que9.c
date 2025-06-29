#include<stdio.h>
int checkGreatest(int,int,int); // declaration

void main(){
		int a,b,c;
	printf("Enter three number:");
	scanf("%d%d%d",&a,&b,&c);
	 int res=checkGreatest(a,b,c); //call
	 printf("Greatest number %d",res);
}

int checkGreatest(int a,int b,int c)
{  // defination
	
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
