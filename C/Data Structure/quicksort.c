#include<stdio.h>
void qsort(int a[10],int first,int last);
int main()
{
	int a[20],l,i;
	printf("\nEnter the size(max-10) of arrray\n");
	scanf("%d",&l);
	printf("\nEnter the element\n");
	for(i=0;i<l;i++)
	{
		scanf("%d",&a[i]);
	}
	qsort(a,0,l-1);
	printf("\nQuick Sorted elements are :");
	for(i=0;i<l;i++)
	{
		printf("\t%d",a[i]);
	}
	printf("\n");
	return 0;
}
void qsort(int a[10],int first,int last)
{
	int i,j,temp,pivot;
	if(first<last)
	{
		i=first;
		j=last;
		pivot=first;
		while(i<j)
		{
			while(a[i]<=a[pivot]&&i<last)
			{
				i++;
			
				while(a[pivot]<a[j])
				{
					j--;
				}

				if(i<j)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			temp=a[pivot];
			a[pivot]=a[j];
			a[j]=temp;
		}
		qsort(a,first,j-1);
		qsort(a,j+1,last);
	}
}
