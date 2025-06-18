#include<stdio.h>
void main()
{
	int n, choice;
	printf("Enter a number");
	scanf("%d",&n);
	printf(" Menu:\n");
	printf("1. check Even or Odd\n");
	printf("2. check Prime or Not\n");
	printf("3. check Palindrome or Not\n");
	printf("4. check Positive, Negative or Zero\n");
	printf("5. Reverse the number\n");
	printf("6. Sum of Digits\n");
	
	printf("Enter a choice");
	scanf("%d",&choice);
	
	int i,flag=0,rev,rem,sum=0;
	for(i=1;i<=6;i++)
	{
		if(choice==1 && i==1)
		{
		if(n%2==0)
		printf("Even");
	   else
		printf("odd");
	
		}
		
		if(choice==2 && i==2)
		{
			for( i=2; i<n;i++)
	      {
		     if(n%2==0)
		    {
			  flag=1;
			  break;
		   }
      	}
     	 if(flag==0)
	    printf("Prime");
	    else
	    printf("not prime");
	}
   
			if(choice==3 && i==3)
			{
				int rem,rev=0;
				int temp=n;
			    while(n>0){
		         rem=n%10;
		         rev=rev*10+rem;
		         n=n/10;
	       }
	       if(rev==temp)
	       printf("Palindrome");
	       else
	       printf("Not Palindrome");
		
     	}
     	
     	if(choice==4 && i==4)
     	{
     		if(n>0)
     		printf("Positive");
     		else if(n<0)
     		printf("Negative");
     		else
     		printf("Zero");
		 }
		 
		 if(choice==5 && i==5)
		 {      int rev=0,rem;
		 		int temp=n;
			    while(n>0){
		         rem=n%10;
		         rev=rev*10+rem;
		         n=n/10;
	       }
	       printf("%d",rev);
		 }
		 
		 if(choice==6 && i==6)
		 {
		 		int temp=n;
			    while(n>0){
		         rem=n%10;
		         sum=sum+rem;
		         n=n/10;
	       }
	       printf("%d",sum);
		 }
}
}
