#include<stdio.h>
void main()
{
	int arr[5],i;
	printf("Enter element of array");
	 for(i=0;i<5;i++)
	 {
	 	scanf("%d",&arr[i]);
	 }
	int res=isPalindrome(arr,5);
	if(res==1)
	  printf("Palindrome");
	else
	  printf("Not Palindrome");
	
}
int isPalindrome(int* arr,int size)
{
	int i=0,j=size-1;
	while(i<j)
	{
		if(arr[i] != arr[j])
		 return 0;
		 i++;
		 j--;
	}
	return 1;
}
