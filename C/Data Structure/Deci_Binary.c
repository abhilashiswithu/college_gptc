#include<stdio.h>
void main()
{
	int num, n, max, i, top=-1;
	printf("\nEnter the limit of the stack.\n");
	scanf("%d",&max);
	int stack[max];
	printf("\nEnter the decimal number.\n");
	scanf("%d",&num);
	if(top==max-1)
	{
		printf("\nStack is 'OVERFLOW'.\n");
	}
	else
	{
		while(num>0)
		{
				top = top+1;
				n = num%2;
				stack[top] = n;
				num = num/2;
		}
	}
	if(top==-1)
	{
		printf("\nStack is 'EMPTY'.\n");
	}
	else
	{
		printf("\nBinary number is :\t");
		for(i=top;i>=0;i--)
		{
			printf("%d",stack[i]);
		}
	}
	printf("\n");
}
