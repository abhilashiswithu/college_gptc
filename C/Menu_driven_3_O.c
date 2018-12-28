#include<stdio.h>
void armstrong(int num);
void palindrome(int num);
void prime(int num);
void main()
{
	int n,num,z;
	printf("    MENU\n");
	printf("\n1.Armstrong");
	printf("\n2.Palindrome");
	printf("\n3.Prime");
	do{
		printf("\n\nEnter your choice.\n");
		scanf("%d",&n);
		{
			switch(n)
			{
				case 1:
						armstrong(num);
						break;
				case 2:
						palindrome(num);
						break;
				case 3:
						prime(num);
						break;
				default:
						printf("\nSORRY! Invalid option.\n");
			}
		}
		
		printf("\nEnter '8' to continue the program.\n");
		scanf("%d",&z);
	  }while(z==8);
	
}
void armstrong(int num)
{
	int rem,ans=0,i;
	printf("\nEnter a number to check whether the number is armstrong or not.\n");
	scanf("%d",&num);
	i=num;
	while(num>0)
	{
		rem=num%10;
		ans=ans+rem*rem*rem;
		num=num/10;
	}
	if(ans==i)
	{
		printf("The number %d is armstrong.\n",i);
	}
	else
	{
	printf("The number %d is not armstrong.\n",i);
	}
}
void palindrome(int num)
{
	int r,a=0,i;
	printf("\nEnter a number to check whether the number is palindrome or not.\n");
	scanf("%d",&num);
	i=num;
	while(num>0)
	{
		r=num%10;
		a=a*10+r;
		num=num/10;
	}
	if(a==i)
	{
		printf("The number %d is palindrome.\n",i);
	}
	else
	{
		printf("The number %d is not palindrome.\n",i);
	}
	
}
void prime(int num)
{
	int i,count;
	count=0;
	printf("\nEnter a number to check whether the number is prime or not.\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count=count+1;
		}
	}
	if(count==2)
	{
		printf("The number %d is prime.\n",num);
	}
	else
	{
		printf("The number %d is not prime.\n",num);
	}
}
