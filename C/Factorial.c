#include<stdio.h>
void main()
{
	int n,i;
	double fact;
	fact=1;
	printf("Enter the number to find its factorial\t");
	scanf("%d",&n);
	for(i=1; i<=n; i++)
	{
		fact=fact*i;
	}
	printf("The factorial of %d is: %f",n,fact);
	printf("\n");
}
