#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
int ch;
struct node
{
	int data;
	struct node *link;
}*front=NULL,*rear=NULL,*new=NULL;
void insert();
void delete();
void display();
void main()
{
	printf("\n\tMENU\n1.Insertion\n2.Deletion\n3.Display\n4.Exit\n");
	do{
		printf("\nEnter your choice:\t");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					insert();
					break;
			case 2:
    				delete();
   					break;
			case 3:
					display();
					break;
		}
	}while(ch!=4);
}
void insert()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element to the Linked Queue :\t");
	scanf("%d",&new->data);
	new->link=NULL;
	if(front==NULL)
	{
		front=rear=new;
	}
	else
	{
			rear->link=new;
			rear=new;
	}
}
void delete()
{
	if(front==NULL)
	{
		printf("\n'Underflow'\n");
	}
 	else
 	{
		printf("\nThe deleted element is : %d\n",front->data);
		front=front->link;
	}
}
void display()
{
	if(front==NULL)
	{
		printf("\n'Underflow'\n");
	}
	else
	{
		printf("\nThe elements in Linked Queue is : ");
		new=front;
		while(new!=NULL)
		{
			printf("%d\t",new->data);
			new=new->link;
			
		}
	}
	printf("\n");
}
