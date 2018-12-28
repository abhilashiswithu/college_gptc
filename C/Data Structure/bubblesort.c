#include<stdio.h>
int a[10],ch,l,i,j,temp;
void insert();
void sort();
void display();
void main()
{
	printf("\nEnter the limit of arrray\n");
	scanf("%d",&l);
	printf("\n\tMENU\n\n1.Insertion\n2.Bubble Sort\n3.Display\n4.Exit");
	do{
		printf("\n\nEnter your choice:\t");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					insert();
					break;
			case 2:
					sort();
					break;
			case 3:
					display();
					break;
			case 4:
					printf("\n\t***Thankyou***\n");
					break;
		}
	}while(ch!=4);
}
void insert()
{
	printf("\nEnter the element to the array\n");
	for(i=0;i<l;i++)
	{
		scanf("%d",&a[i]);
	}
}
void sort()
{
	for(i=0;i<l;i++)
	{
		for(j=0;j<(l-1);j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	printf("\n\tSorted");
}
void display()
{
	printf("\nElements are :");
	for(i=0;i<l;i++)
	{
		printf("\t%d",a[i]);
	}
}
