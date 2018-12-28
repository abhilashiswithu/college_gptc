#include<stdio.h>
void sum(int num);
void reverse(int num);
void main()
{
	int n,num,z;
	printf("      	MENU\n");
	printf("\n1.Sum of digit of a number.");
	printf("\n2.Reverse of a number.\n");
	do{
		printf("\nEnter your choice.\n");
		scanf("%d",&n);
		{
			switch(n)
			{
				case 1:
						sum(num);
						break;
				case 2:
						reverse(num);
						break;
				default:
						printf("\nSORRY! Invalid choice.\n");
			}
		}
		printf("\nEnter '8' to continue the program.\n");
		scanf("%d",&z);
	  }while(z==8);
	
}

void reverse(int num)
{
	int r,a=0,i;
	printf("\nEnter a number to find the reverse.\n");
	scanf("%d",&num);
	i=num;
	while(num>0)
	{
		r=num%10;
		a=a*10+r;
		num=num/10;
	}
	printf("The reverse of number %d is %d .\n",i,a);
}
void sum(int num)
{
	int r,s=0,i;
	printf("\nEnter a number to find the sum of digit.\n");
	scanf("%d",&num);
	i=num;
	while(num>0)
	{
		r=num%10;
		s=s+r;
		num=num/10;
	}
	printf("The sum of digit of the number %d is %d.\n",i,s);
}

