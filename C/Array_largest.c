#include<stdio.h>
void main()
{
	int num,nm,i,n[20],count,larg;
	printf("Enter 2 or more no.s\n");
	printf("Enter the '999' to terminate\n");
	scanf("%d",&num);
	i=0;
	do{
		n[i]= num;
		printf("Enter the no.\n");
		printf("Enter the '999' to terminate\n");
		scanf("%d",&num);
		n[i]=n[i+1];
	  }while(num!=999);
	for(i=0;i<=20;i++)
	{
		if(n[i]>n[i+1])
		{
			larg=n[i];
		}
		else
		{
			larg=n[i+1];
		}
	}
	printf("The largest number is : %d\n",larg);
}
