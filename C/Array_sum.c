#include<stdio.h>
void main()
{
	int num,s,i,n[20],count;
	printf("Enter 2 or more no.s\n");
	printf("Enter the '999' to terminate\n");
	scanf("%d",&num);
		s=0;
		i=0;
		count=0;
	while(num!=999)
	{
		n[i]= num;
		s = s+n[i];
		printf("Enter the no.\n");
		printf("Enter the '999' to terminate\n");
		scanf("%d",&num);
		n[i]=n[i+1];
		count = count+1;
	}
	printf("The sum of %d number is: %d\n",count,s);
}
