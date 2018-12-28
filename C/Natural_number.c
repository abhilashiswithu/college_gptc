#include<stdio.h>
void main()
{
	int n,i;
	printf("Enter the limit of the natural numbers\n");
	scanf("%d",&n);
	printf("The natural number upto %d is:\n",n);
	for(i=1; i<=n; i++)
	{
		printf("\t%d",i);
	}
	printf("\n");
}
