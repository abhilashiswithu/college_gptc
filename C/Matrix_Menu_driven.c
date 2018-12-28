#include<stdio.h>
void main()
{
	int n,z,i,j,r,c,mrx[10][10];
	printf("            MENU\n");
	printf("\n1.Transpose of the square matrix.");
	printf("\n2.Upper triangle of the square matrix.");
	printf("\n3.Lower triangle of the square matrix.\n");
	{
		printf("\nPlease enter the number of rows & columns of matrix.\n");
		scanf("%d%d",&r,&c);
		printf("\nEnter the elements to the matrix.\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				scanf("%d",&mrx[i][j]);
			}
		}
		printf("\n");
		for(i=0;i<r;i++)
		{
			printf("| ");
			for(j=0;j<c;j++)
			{
				printf("%d ",mrx[i][j]);
			}
			printf("|\n");
		}
	}
	do{
		printf("\n\nEnter your choice.\n");
		scanf("%d",&n);
		{
			switch(n)
			{
				case 1:
						//Transpose
						{
							printf("\nThe transpose of the matrix is :\n");
							for(i=0;i<c;i++)
							{
								printf("| ");
								for(j=0;j<r;j++)
								{
									printf("%d ",mrx[j][i]);
								}
								printf("|\n");
							}
						}
						break;
				case 2:
						//Upper Triangle
						{
							printf("\nThe upper triangle of the matrix is :\n\n");
							for(i=0;i<r;i++)
							{
								printf("| ");
								for(j=0;j<c;j++)
								{
									if(i<=j)
									{
										printf("%d ",mrx[i][j]);
									}
									else
									{
										printf("  ");
									}
								}
								printf("|\n");
							}
						}
						break;
				case 3:
						//Lower Triangle
						{
							printf("\nThe lower triangle of the matrix is :\n\n");
							for(i=0;i<r;i++)
							{
								printf("| ");
								for(j=0;j<c;j++)
								{
									if(i>=j)
									{
										printf("%d ",mrx[i][j]);
									}
									else
									{
										printf("  ");
									}
								}
								printf("|\n");
							}
						}
						break;
				default:
						printf("\nSORRY! Invalid option.\n");
			}
		}
		
		printf("\nEnter '8' to continue the program.\n");
		scanf("%d",&z);
	  }while(z==8);
	
}
