#include<stdio.h>
void insert();
void delete();
void display();
int queue[10],max,front=-1,rear;
void main()
{
	int c, ch;
	printf("\nenter the limit\n");
	scanf("%d",&max);
	printf("\n\n\tMENU\n\n1.INERTION\n2.DELETION\n3.DISPLAY\n");
	do
	{
		printf("\nenter your choice\n");
		scanf("%d",&c);
		switch(c)
		{
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: display(); break;
			default: printf("\n SORRY! Invalid option\n");
		}
		printf("\nenter 7 to continue\n");
		scanf("%d",&ch);
	}while(ch==7);
}
void insert()
{
	int val;
	if((rear==max-1)&&(front==0))
	{
		printf("\noverflow\n");
	}
	else if((front==-1)||(rear==-1))
	{
		printf("\nEnter the element to the queue\n");
		scanf("%d",&val);
		front=rear=0;
		queue[rear]=val;
	}
	else if((front!=0)&&(rear==max-1))
	{
		
		printf("\nEnter the element to the queue\n");
		scanf("%d",&val);
		rear=0;
		queue[rear]=val;
	}
	else
	{
		rear=rear+1;
		printf("\nEnter the element to the queue\n");
		scanf("%d",&val);
		queue[rear]=val;
		
	}
}
void delete()
{
	int val;
	if(front==-1)
	{
		printf("\nunderflow\n");
	}
	else if(front==rear)
	{
		val = queue[front];
		front=rear=-1;
		printf("\nThe deleted element is %d.\n",val);
	}
	else if(front==max-1)
	{
		val = queue[front];
		front=0;
		printf("\nThe deleted element is %d.\n",val);
	}
	else
	{
		val = queue[front];
		front = front+1;
		printf("\nThe deleted element is %d.\n",val);
	}
}
void display()
{
	int i;
	if(front==(-1))
	{
		printf("\nunderflow\n");
	}
	else
	{
		printf("\nthe elements in the Queue is :");
		for(i=front;i<=rear;i++)
		{
			printf("\t%d",queue[i]);
		}
	}

}
