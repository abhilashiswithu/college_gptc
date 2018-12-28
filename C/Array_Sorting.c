#include<stdio.h>
void main()
{
	int i,num[10],j,TEMP;
	printf("\nEnter 10 numbers to implement of an array sorting in Ascending order\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&num[i]);
	}
	printf("\nThe Ascending order of sorted array is :");
	for(i=0;i<10;i++)
	{
		for(j=0;j<(10-1);j++)
		{
			if(num[i]<num[j])
			{
				TEMP= num[i];
				num[i]=num[j];
				num[j]=TEMP;
			}
		}
	}
	for(i=0;i<10;i++)
	{
		printf("\n\t\t\t\t\t%d",num[i]);
	}
	printf("\n");
}
