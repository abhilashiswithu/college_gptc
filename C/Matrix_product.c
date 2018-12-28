#include<stdio.h>
void main()
{
	int i,j,k,mrx1[10][10],mrx2[10][10],mrxS[10][10],m,n,p,q,r,c;
	printf("\nTo find the product of two Matrices.\n\n");
	for(k=0;k<2;k++)
	{
		if(k==0)
		{
			printf("Enter the number of rows & column of matrix %d.\n",(k+1));
			scanf("%d%d",&m,&n);
			printf("\nEnter the elements to matrix %d.\n",(k+1));
			r=m;
			c=n;
		}
		else if(k==1)
		{
			printf("Enter the number of rows & column of matrix %d.\n",(k+1));
			scanf("%d%d",&p,&q);
			printf("\nEnter the elements to matrix %d.\n",(k+1));
			r=p;
			c=q;
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
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
		for(i=0;i<r;i++)
		{
			printf("| ");
			for(j=0;j<c;j++)
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
	printf("\nProduct of two Matrices is:\n\n");
	for(k=0;k<2;k++)
	{
		if(k==0)
		{
			printf("\n");
			r=m;
			c=n;
		}
		else if(k==1)
		{
			printf("\n    *\n\n");
			r=p;
			c=q;
		}
		for(i=0;i<r;i++)
		{
			printf("| ");
			for(j=0;j<c;j++)
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
	if(n==p)
	{
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
	else
	{
		printf("\nSORRY!!! This matrice cann't multiplied.\n");
	}
	
}
