#include<stdio.h>
void main()
{
	int b=0,a=0,c=1,num;
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
