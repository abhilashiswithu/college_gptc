#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *link;
}*new=NULL;
int ch,top;
void push();
void pop();
void show();
void main()
{
	printf("\n\tMENU\n1.Push\n2.Pop\n3.Show\n4.Exit\n");
	do{
		printf("\nEnter your choice:\t");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					push();
					break;
			case 2:
    				pop();
   					break;
			case 3:
					show();
					break;
		}
	}while(ch!=4);
}
void push()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element to the Linked Stack :\t");
	scanf("%d",&new->data);
	if(top==NULL)
	{
		top=new;
		new->link=NULL;
	}
	else
	{
		new->link=top;
		top=new;
	}
	
}
void pop()
{
	if(top==NULL)
	{
		printf("\n'Underflow'\n");
	}
	else
	{
		new=top;
		printf("\nThe deleted element is : %d\n",new->data);
		top=new->link;
	}
}
void show()
{
	if(top==NULL)
	{
		printf("\n'Underflow'\n");
	}
	else
	{
		new=top;
		printf("\nThe elements in Linked Stack is : ");
		while(new!=NULL)
		{
			printf("%d\t",new->data);
			new=new->link;
			
		}
	}
	printf("\n");
}
