#include<stdio.h>
void factorial(int num);
void fibonocci(int num);
void main()
{
	int n,num,z;
	printf("    MENU\n");
	printf("\n1.Factorial");
	printf("\n2.Fibonacci\n");
	do{
		printf("\nEnter your choice.\n");
		scanf("%d",&n);
		{
			switch(n)
			{
				case 1:
						factorial(num);
						break;
				case 2:
						fibonocci(num);
						break;
				default:
						printf("\nSORRY! Invalid option.\n");
			}
		}
		
		printf("\nEnter '8' to continue the program.\n");
		scanf("%d",&z);
	  }while(z==8);
	
}

void factorial(int num)
{
	int i,fact;
	fact=1;
	printf("\nEnter the number to find its factorial.\n");
	scanf("%d",&num);
	for(i=1; i<=num; i++)
	{
		fact=fact*i;
	}
	printf("The factorial of %d is: %d.",num,fact);
	printf("\n");
}
void fibonocci(int num)
{
	int b=0,a=0,c=1;
	printf("\nEnter the number, to display the fibonacci series up to the inputed number.\n");
	scanf("%d",&num);
	printf("The fibonacci series up to %d is :\n",num);
	printf("\n%d",a);
	printf("\t%d",b);
	while(c<=num)
	{
		printf("\t%d",c);
		a=b;
		b=c;
		c=a+b;	
	}
	printf("\n");
}
