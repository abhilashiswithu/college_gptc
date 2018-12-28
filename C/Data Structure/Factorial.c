#include<stdio.h>
void factorial();
int fact, facto=1, num;
void main()
{
	printf("\nEnter the number to find its factorial.\n");
	scanf("%d",&num);
	fact=num;
	if(num==1)
	{
		printf("\nThe factorial of %d is : 1.\n",num);
	}
	else
	{
		factorial();
	}
	printf("\nThe factorial of %d is : %d.\n",num,facto);
}
void factorial()
{
	while(fact>1)
	{
		facto=facto*fact;
		fact=fact-1;
	}
}
