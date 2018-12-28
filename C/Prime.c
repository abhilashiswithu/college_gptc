#include<stdio.h>
void main()
{
	int i,num;
	int count=0;
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
