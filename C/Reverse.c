#include<stdio.h>
void main()
{
	int num,r,a=0,i;
	printf("Enter a number to find the reverse \t");
	scanf("%d",&num);
	i=num;
	while(num>0)
	{
		r=num%10;
		a=a*10+r;
		num=num/10;
	}
	printf("The reverse of number %d is %d \n",i,a);
}
