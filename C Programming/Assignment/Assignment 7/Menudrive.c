#include<stdio.h>
void main()
{
	int arr[20];
	int choice,exit;
	int currentindex=0;
do{
	
	printf(" 1.To insert element\n2.To update element\n3.Search element\n4.Delete element\n5.Display element");
	scanf("%d",&choice);
	
	
	if(choice==1)
	{
		printf("Enter the element you want to insert");
		int ele;
		scanf("%d",&ele);
		insertInArray(arr,&currentindex,ele);	
	}
  else if(choice==2)
	{
		printf("Update code is executed");
	}
  else  if(choice==3)
	{
	   printf("Enter element you want to search");
	   int ele;
	   scanf("%d",&ele);
	int index=search(arr,currentindex,ele);
	if(index==-1)
	printf("Not found");
	else
	printf("found at %d index",index);
   }
  else if(choice==4)
	{
		 printf("delelte element you want to search");
	   int ele;
	   scanf("%d",&ele);
	   deleteElement(arr,&currentindex,ele);
	}
  else if(choice==5)
	{
		display(arr,currentindex);
	}
  else
  {
  	printf("Invalid choice");
  }
  printf("\nDo you want to continue 0 or 1");
  scanf("%d",&exit);
}while(exit==1);
}

void insertInArray(int* arr,int* currentindex,int ele)
{
	arr[*currentindex]=ele;
	(*currentindex)++;
}
void display(int* arr,int currentindex)
{
	int i;
	printf("[");
	for(i=0;i<currentindex;i++)
	{
		printf("%d ,",arr[i]);
	}
	printf("\b]");
}
int search(int* arr,int cindex,int ele)
{
	int i;
	for(i=0;i<cindex;i++)
	if(arr[i]==ele)
	{
		return i;
	}
	return -1;
}
void deleteElement(int* arr,int* ci, int ele)
{
	int i;
	int index=search(arr,*ci,ele);
	if(index==-1)
	printf("Element not found");
	else
	 for(i=index;i<*ci-1;i++)
	 {
	    arr[i]=arr[index+1];
 }
  (*ci)--;
	
}
