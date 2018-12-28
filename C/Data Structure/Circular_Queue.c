#include<stdio.h>
void insert();
void delete();
void display();
int queue[10],max,front=-1,rear;
void main()
{
	int c,ch;
	printf("\nEnter the limit of the Circular Queue\n");
	scanf("%d",&max);
	printf("\n	MENU\n\n");
	printf("1. INSERTION\n");
	printf("2. DELETION\n");
	printf("3. DISPLAY\n");
	do{
		printf("\nEnter your choice.\n");
		scanf("%d",&c);
		switch(c)
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
			default:
					printf("\nSORRY! Invalid choice.\n");
		}
		printf("\nEnter '7' to continue the program, else terminate with other number.\n");
		scanf("%d",&ch);
	}while(ch==7);
}
void insert()
{
	int val;
	if(rear==max-1&&front==0)
	{
		printf("\nQueue is 'OVERFLOW'.\n");
	}
	else if(front==(-1) || rear==(-1))
	{
		front=rear=0;
		printf("\nEnter the element to the Queue.\n");
		scanf("%d",&val);
		queue[rear]=val;
	}
	else if(rear==max-1&&front!=0)
	{
		rear=0;
		printf("\nEnter the element to the Queue.\n");
		scanf("%d",&val);
		queue[rear]=val;
	}
	else
	{
		rear = rear+1;
		printf("\nEnter the element to the Queue.\n");
		scanf("%d",&val);
		queue[rear]=val;
	}
}
void delete()
{
	int val;
	if(front==-1)
	{
		printf("\nQueue is 'UNDERFLOW'.\n");
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
	if(front==-1)
	{
		printf("\nQueue is 'UNDERFLOW'.\n");
	}
	else
	{
		printf("\nThe elements in the Queue is :");
		for(i=front;i<=rear;i++)
		{
			printf("\t%d",queue[i]);
		}
	}
	printf("\n");
} 
