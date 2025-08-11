#include<stdio.h>
#include<string.h>
typedef struct Book{
	int id;
	char name[50];
	char author[50];
	char category[50];
	float price;
	float rating;
}Book;
void addBook(Book*,int* );
void storeHardcoded(Book* ,int* );
void displayBook(Book*,int );
int searchBook(Book* ,int ,int );
void removeBook(Book* ,int* ,int );
int showAuthorBook(Book* ,int ,char*);
int showCategoryBook(Book*,int ,char* );
int updateBook(Book* ,int ,int);
void top3BookByPrice(Book* ,int);
void top3BookByReating(Book*,int);
void main()
{
	Book book[50];
	int count=0;
	int choice,exit;
	storeHardcoded(book,&count);

do{
	
	printf("\n**********Book Management System**********\n");
	printf("1.Add book\n2.Display All Book\n3.Remove Book\n4.Search Book \n5.Show Author Books\n6.Show Category Books\n7.Update Book price and reating\n8.Display top 3 book Price\n9.Display top 3 Books Reating\n");
	printf("Enter your choice");
	scanf("%d",&choice);
	
	if(choice==1)
	{
		//addBook(book,&count);
		
	}
	else if(choice==2)
	{
		displayBook(book,count);
	}
	else if(choice==3)
	{
		int id;
		printf("Enter id of Book you want to remove");
    	scanf("%d",&id);
		removeBook(book,&count,id);
	}
	else if(choice==4)
	{
	    int id;
    	printf("Enter Book ID to search");
    	scanf("%d",&id);
	
    	int index=searchBook(book,count,id);
	    if(index!=-1)
	    {
	    	printf("Book found at index %d: Id=%d, name=%s, Author=%s, Category=%s, Price=%.2f, Rating=%.1f\n",index,book[index].id,book[index].name, book[index].author,book[index].category,book[index].price,book[index].rating);
	    	
		}
		else
		{
			printf("Book not found\n");
		}
		
	}
	else if(choice==5)
	{
		char authorName[50];
		getchar();
		printf("Enter Author name:");
		gets(authorName);
		int found=showAuthorBook(book,count,authorName);
		if(found==0)
		  printf("\nNo books found by this author");
	}
	else if(choice==6)
	{
		
		char category[50];
		getchar();
		printf("Enter category name to search:");
		gets(category);
		int found=showCategoryBook(book,count,category);
		if(found==0)
		  printf("\nNo books found by this category");
	}
	else if(choice==7)
	{
		int id;
		printf("Enter book id");
		scanf("%d",&id);
		
	int found=updateBook(book,count,id);
	if(found==0)
	printf("Book id not found %d",id);
	}
	else if(choice==8)
	{
		top3BookByPrice(book,count);
	}
	else if(choice==9)
	{
		top3BookByReating(book,count);
	}
	else
	{
		printf("Invalid choice");
	}
	 printf("\nDo you want to continue 0 or 1");
     scanf("%d",&exit);
}while(exit==1);
}

// add book
/*void addBook(Book* book,int* count)

{
	printf("\nEnter book Id");
	scanf("%d",&book[*count].id);
	getchar();
	printf("Enter book Name");
	gets(book[*count].name);
	printf("Enter Author name");
	gets(book[*count].author);
	printf("Enter Category");
	gets(book[*count].category);
	printf("Enter Price ");
	scanf("%f",&book[*count].price);
	printf("Enter Rating ");
	scanf("%f",&book[*count].rating);
	(*count)++;
	printf("Book added Successfully\n");
	
}*/
//store hardcoded
void storeHardcoded(Book* book,int* count)
{
	book[0].id=1;
	strcpy(book[0].name,"C Programming");
	strcpy(book[0].author,"Dennis Ritchie");
	strcpy(book[0].category,"Programming");
	book[0].price=499.99;
	book[0].rating=4.5;
	
	book[1].id=2;
	strcpy(book[1].name,"python Basics");
	strcpy(book[1].author,"Guido Rossum");
	strcpy(book[1].category,"Programming");
	book[1].price=599.00;
	book[1].rating=4.8;
	
	book[2].id=3;
	strcpy(book[2].name,"Digital Marketing");
	strcpy(book[2].author,"Neil Patel");
	strcpy(book[2].category,"Marketing");
	book[2].price=299.99;
	book[2].rating=4.3;
	
	book[3].id=4;
	strcpy(book[3].name,"Data Structure");
	strcpy(book[3].author,"Mark Allen Weiss");
	strcpy(book[3].category,"Computer Science");
	book[3].price=799;
	book[3].rating=4.7;
	
	book[4].id=5;
	strcpy(book[4].name,"Wings of Fire");
	strcpy(book[4].author,"A.P.J.Abdul Kalam");
	strcpy(book[4].category,"Biography");
	book[4].price=250;
	book[4].rating=4.6;
	
	book[5].id=6;
	strcpy(book[5].name,"Mrityunjay");
	strcpy(book[5].author,"Shivaji Sawant");
	strcpy(book[5].category,"Marathi");
	book[5].price=400;
	book[5].rating=4.3;
	*count=6;
}
//Display book
void displayBook(Book* book,int count)
{
	int i;
	for(i=0;i<count;i++)
	{
		printf("\nBook %d\n",i+1);
		printf("Id: %d\n",book[i].id);
		printf("Name: %s\n",book[i].name);
		printf("Author: %s\n",book[i].author);
		printf("Category: %s\n",book[i].category);
		printf("Price: %.2f\n",book[i].price);
		printf("Rating: %.1f\n",book[i].rating);
	}
}
//search book
int searchBook(Book* book,int count,int id)
{
	int i;
	for(i=0;i<count;i++)
	{
		if(book[i].id==id)
		 return i;
	}
	return -1;
}
//delete book
void removeBook(Book* book,int* count,int id)
{
	int i;
	int index=searchBook(book,*count,id);
	if(index==-1)
	printf("Book Not found");
	else
	{
		for(i=index;i<*count-1;i++)
		{
			book[i]=book[i+1];
		}
	 (*count)--;
	 printf("Remove Book Successfully.\n");
	}
}
// show author book
int showAuthorBook(Book* book,int count,char* authorName)	
{
		int i;
		int found =0;
		for(i=0;i<count;i++)
		{
			if(strcmp(book[i].author,authorName)==0)
			{
				printf("\nBook %d\n",i+1);
				printf(" Id=%d\n name=%s\n Author=%s\n Category=%s\n Price=%.2f\n Rating=%.1f\n",book[i].id,book[i].name, book[i].author,book[i].category,book[i].price,book[i].rating);
				found =1;
	    	
			}
		}
		return found;
}
//show category
int showCategoryBook(Book* book,int count,char* category)
{
	int i;
	int found=0;
	for(i=0;i<count;i++)
	{
		if(strcmp(book[i].category,category)==0)
		{
			
			printf("\nBook %d\n",i+1);
				printf(" Id=%d\n name=%s\n Author=%s\n Category=%s\n Price=%.2f\n Rating=%.1f\n",book[i].id,book[i].name, book[i].author,book[i].category,book[i].price,book[i].rating);
				found =1;
		}
	}
	return found;
}
//update book
int updateBook(Book* book,int count,int id)
{
	int i;
	int found=0;
	for(i=0;i<count;i++)
	{
		if(book[i].id==id)
		{
			printf("\n----current book data----\n");
			printf("Price= %2.f\n",book[i].price);
			printf("Rating=%.1f\n",book[i].rating);
			printf("Enter new price");
			scanf("%f",&book[i].price);
			printf("Enter new Reating");
			scanf("%f",&book[i].rating);
		   printf("Book data update successfully\n");
		   found=1;
		   break;
		}
		return found;
	}
}
// top 3 by price
void top3BookByPrice(Book* book,int count)
{
	Book temp;
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if(book[j].price<book[j+1].price)
			{
			  temp=book[j];
			  book[j]=book[j+1];
			  book[j+1]=temp;
			}
		}
	}
	printf("\n Top 3 Book by price\n");
	{
		for(i=0;i<3;i++)
		{
			printf("%s%.2f\n",book[i].name,book[i].price);
		}
	}
}
//top 3 by rating
void top3BookByReating(Book* book,int count)
{
	Book temp;
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if(book[j].rating<book[j+1].rating)
			{
			  temp=book[j];
			  book[j]=book[j+1];
			  book[j+1]=temp;
			}
		}
	}
	printf("\n Top 3 Book by Rating\n");
	{
		for(i=0;i<3;i++)
		{
			printf("%s %.1f\n",book[i].name,book[i].rating);
		}
	}
}






