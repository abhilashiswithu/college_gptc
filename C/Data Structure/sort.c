#include<stdio.h>
int split(int z[],int,int);
void main()
{
	int a[10],n,i;
	printf("enter size:\t");
	scanf("%d",&n);
	printf("enter element");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	qsort(a,0,n-1);
	printf("sorted array is");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}
void qsort(int z[],int lower,int upper)
{
	int i;
	if(upper>lower)
	{
 		i=split(z,lower,upper);
		qsort(z,lower,i-1);
		qsort(z,i+1,upper);
	}
}
int split(int z[],int lower,int upper)
{
	int i,a,b,t;
	a=lower+1;b=upper;
	i=z[lower];
	while(b>=a)
	{
		while(z[a]<i)
		a++;
		while(z[b]>i)
		b--;
		if(b>a)
		{
			t=z[a];
			z[a]=z[b];
			z[b]=t;
		}
	}
	t=z[lower];
	z[lower]=z[b];
	z[b]=t;
	return b;
}
