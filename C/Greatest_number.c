#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter 3 numbers to find the greatest among 3\n");
	scanf("%d%d%d",&a,&b,&c);
	if((a>b)&&(a>c))
	{
		printf("The greatest number is %d",a);
	}
	else
	{
		if(b>c)
		{
			printf("The greatest number is %d",b);
		}
		else
		{
			printf("The greatest number is %d",c);
		}
	}
	printf("\n");
}
