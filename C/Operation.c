#include<stdio.h>
void main()
{
	int a,b,c;
	float x,y,z;
	printf("Enter 3 numberto evaluate the following expression\n");
	printf("1. a*b+c\n");
	printf("2. (c/a)*b\n");
	printf("3. a+c*((c/a)*3)-c\n");
	scanf("%d%d%d",&a,&b,&c);
	x= a*b+c;
	y= (c/a)*b;
	z= a+c*((c/a)*3)-c;
	printf("1. %d*%d+%d = %f\n",a,b,c,x);
	printf("2. (%d/%d)*%d = %f\n",c,a,b,y);
	printf("3. %d+%d*((%d/%d)*3)-%d = %f\n",a,c,c,a,c,z);
}
