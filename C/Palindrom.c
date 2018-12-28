#include<stdio.h>
void main()
{
	int num,r,a=0,i;
	printf("Enter a number to check whether the number is palindrom or not\t");
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
			printf("The number %d is palindrom \n",i);
		}
		else
		{
			printf("The number %d is not palindrom \n",i);
		}
	
}
