#include<stdio.h>
void swap(int* ,int ,int );
void main()
{
	int arr[7];
	int x,y;
	int i;
	printf("Enter element of array");
	for(i=0;i<7;i++)
	 {
	 	scanf("%d",&arr[i]);
	 }
	 printf("Enter xth position");
	 scanf("%d",&x);
	  printf("Enter yth position");
	 scanf("%d",&y);
	 swap(arr,x,y);
	 printf("\nArray after Swapping");
	 for(i=0;i<7;i++)
	 {
	 	printf(" %d",arr[i]);
	 }
	 
}
void swap(int* arr,int x,int y)
{
	int temp;
	temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
}
