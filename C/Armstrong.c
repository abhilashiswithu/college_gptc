#include<stdio.h>
void main()
{
	int num,rem,ans=0,i;
	printf("Enter a number to check whether the number is armstrong or not\t");
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
			printf("The number %d is armstrong \n",i);
		}
		else
		{
			printf("The number %d is not armstrong \n",i);
		}
}
