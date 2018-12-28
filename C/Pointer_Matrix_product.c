#include<stdio.h>
void matrix(int(*)m1[10][10],)
void main()
{
	int i,j,k,mrx1[10][10],mrx2[10][10],mrxS[10][10];
	printf("\nTo find the sum of two '3x3' Matrices.\n");
	for(k=0;k<2;k++)
	{
		if(k==0)
		{
			printf("\nEnter the elements to matrix %d of order (3x3).\n",(k+1));
		}
		else if(k==1)
		{
			printf("\nEnter the elements to matrix %d of order (3x3).\n",(k+1));
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(k==0)
				{
					scanf("%d",&mrx1[i][j]);
				}
				else if(k==1)
				{
					scanf("%d",&mrx2[i][j]);
				}
			}
		}
		printf("\n");
		for(i=0;i<3;i++)
		{
			printf("| ");
			for(j=0;j<3;j++)
			{
				if(k==0)
				{
					printf("%d ",mrx1[i][j]);
				}
				else if(k==1)
				{
					printf("%d ",mrx2[i][j]);
				}
			}
				printf("|\n");
		}
	}
	printf("\nSum of two '3x3' Matrices is:\n\n");
	for(k=0;k<2;k++)
	{
		if(k==0)
		{
			printf("\n");
		}
		else if(k==1)
		{
			printf("\n    +\n\n");
		}
		for(i=0;i<3;i++)
		{
			printf("| ");
			for(j=0;j<3;j++)
			{
				if(k==0)
				{
					printf("%d ",mrx1[i][j]);
				}
				else if(k==1)
				{
					printf("%d ",mrx2[i][j]);
				}
			}
			printf("|\n");
		}
	}
	printf("\n=========\n");
	for(i=0;i<3;i++)
	{
		printf("| ");
		for(j=0;j<3;j++)
		{
			mrxS[i][j] = mrx1[i][j] + mrx2[i][j];
			printf("%d ",mrxS[i][j]);
		}
		printf("|\n");
	}	
}
