#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
int ch,val;
struct node
{
	int data;
	struct node *link;
}*new=NULL,*head=NULL,*temp=NULL,*ptr=NULL;
void create();
void insert1();
void insert2();
void insert3();
void insert4();
void insert5();
void count();
void search1();
void search2();
void delete1();
void delete2();
void delete3();
void display();
void main()
{
	printf("\n\tMENU\n\n1.Creating\n2.Inserting at begining\n3.Inserting at end\n4.Inserting after a data\n5.Inserting before a data\n6.Inserting in sorted list\n7.Count\n8.Search in unsorted list\n9.Search in sorted list\n10.Deleting at begining\n11.Deleting at end\n12.Deleting any element\n13.Display\n14.Exit");
	do{
		printf("\nEnter your choice:\t");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					create();
					break;
			case 2:
					insert1();
					break;
			case 3:
					insert2();
					break;
			case 4:
					insert3();
					break;
			case 5:
					insert4();
					break;
			case 6:
					insert5();
					break;
			case 7:
					count();
					break;
			case 8:
					search1();
					break;
			case 9:
					search2();
					break;
			case 10:
					delete1();
					break;
			case 11:
					delete2();
					break;
			case 12:
					delete3();
					break;
			case 13:
					display();
					break;
			case 14:
					printf("\n\t***Thankyou***\n\n");
					break;
		}
	}while(ch!=14);
}
void create()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->link=NULL;
	if(head==NULL)
	{
		head=new;
	}
	else
	{
		temp=head;
		while(temp->link!=NULL)
		{
			temp=temp->link;
		}
		temp->link=new;
	}
}
void display()
{
	temp=head;
	if(temp==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		printf("\nElements are :\t");
	}
	while(temp!=NULL)
	{
		printf("%d\t",temp->data);
		temp=temp->link;
	}
	printf("\n");
}
void count()
{
	int c=0;
	temp=head;
	if(temp==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		while(temp!=NULL)
		{
			c++;
			temp=temp->link;
		}
		printf("\nNumber of nodes :\t%d\n",c);
	}
}
void insert1()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->link=head;
	head=new;
}
void insert2()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->link=NULL;
	temp=head;
	while(temp->link!=NULL)
	{
		temp=temp->link;
	}
	temp->link=new;
}
void insert3()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element to allocate the position after it :\t");
	scanf("%d",&val);
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->link=NULL;
	temp=head;
	ptr=temp;
	while(ptr->data!=val)
	{
		ptr=temp;
		temp=temp->link;
	}
	ptr->link=new;
	new->link=temp;	
}
void insert4()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element to allocate the position before it :\t");
	scanf("%d",&val);
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->link=NULL;
	temp=head;
	ptr=temp;
	while(temp->data!=val)
	{
		ptr=temp;
		temp=temp->link;
	}
	ptr->link=new;
	new->link=temp;	
}
void insert5()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element in sorted list:\t");
	scanf("%d",&val);
	new->data=val;
	new->link=NULL;
	temp=head;
	ptr=temp;
	while(temp->data<val)
	{
		ptr=temp;
		temp=temp->link;
	}
	ptr->link=new;
	new->link=temp;	
}
void delete1()
{
	if(head==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		temp=head;
		printf("\nDeleted element is:\t%d",temp->data);
		head= head->link;
		
	}
}
void delete2()
{
	if(head==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		temp=head;
		while(temp->link!=NULL)
		{
			ptr=temp;
			temp=temp->link;
		}
		ptr->link=NULL;
		printf("\nDeleted element is:\t%d",temp->data);
	}
}
void delete3()
{
	if(head==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		printf("\nEnter the element to delete from the list :\t");
		scanf("%d",&val);
		temp=head;
		while(temp->data!=val)
		{
			ptr=temp;
			temp=temp->link;
		}
		ptr->link=temp->link;
		printf("\n%d is deleted\n",temp->data);
	}
}
void search1()
{
	int f=0,c=0;
	temp=head;
	if(temp==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		printf("\nEnter the element to search in this list :\t");
		scanf("%d",&val);
		while(temp!=NULL)
		{
			c++;
			f=1;
			if(val==temp->data)
			{
				break;
			}
			else
			{
				temp=temp->link;
			}
		}
		printf("\n\t%d is at %dth position\n",temp->data,c);
	}
}
void search2()
{
	int f=0,c=0;
	temp=head;
	if(temp==NULL)
	{
		printf("\nUnderflow");
	}
	else
	{
		printf("\nEnter the element to search in this list :\t");
		scanf("%d",&val);
		while(temp!=NULL)
		{
			c++;
			f=1;
			if(val==temp->data)
			{
				break;
			}
			else if(temp->data<val)
			{
				temp=temp->link;
			}
		}
		printf("\n\t%d is at %dth position\n",temp->data,c);
	}
}
