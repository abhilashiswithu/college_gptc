#include<stdio.h>
void push();
void pop();
void peep();
void show();
int stack[10],max,top=-1;
void main()
{
	int c,ch;
	printf("\nEnter the limit of the stack.\n");
	scanf("%d",&max);
	printf("\n	MENU\n\n");
	printf("1. PUSH\n");
	printf("2. POP\n");
	printf("3. PEEP\n");
	printf("4. SHOW\n\n");
	do{
		printf("\nEnter your choice.\n");
		scanf("%d",&c);
		switch(c)
		{
			case 1:
					push();
					break;
			case 2:
					pop();
					break;
			case 3:
					peep();
					break;
			case 4:
					show();
					break;
			default:
					printf("\nSORRY! Invalid choice.\n");
		}
		printf("\nEnter '7' to continue the program, else terminate with other number.\n");
		scanf("%d",&ch);
	}while(ch==7);
}
void push()
{
	int val;
	if(top == max-1)
	{
		printf("\nStack is OVERFLOW.\n");
	}
	else
	{
		printf("\nEnter the element to the stack.\n");
		scanf("%d",&val);
			top = top+1;
			stack[top] = val;
	} 
}
void pop()
{
	int val;
	if(top == -1)
	{
		printf("\nStack is UNDERFLOW.\n");
	}
	else
	{
		val = stack[top];
		top = top-1;
	}
	printf("The deleted element is '%d'.\n",val);
}
void peep()
{
	int val;
	if(top == -1)
	{
		printf("\nStack is UNDERFLOW.\n");
	}
	else
	{
		val = stack[top];
		 printf("The last element in stack is '%d'.\n",val);
	}
}
void show()
{
	int i;
	if(top == -1)
	{
		printf("\nStack is UNDERFLOW\n");
	}
	else
	{
		printf("The elements in the stack is :");
		for(i=top;i>=0;i--)
		{
			printf("\t%d",stack[i]);
		}
	}
	printf("\n");
}
