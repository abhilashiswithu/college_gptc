#include<stdio.h>
#include<math.h>
void main()
{
	float r,r1,r2,d,a,b,c;
	printf("To find the root of quadratic equation\n");
	printf("Enter the value for 'a','b',and 'c' to find the root of quadratic equation\n");
	scanf("%f%f%f",&a,&b,&c);
	d = b*b-4*a*c;
	if(d<=0)
	{
		r = -b/(2*a);
		printf("The root is : %f\n",r);
	}
		else if(d>0)
		{
			r1= (-b+sqrt(d))/(2*a);
			r2= (-b-sqrt(d))/(2*a);
			printf("The root is: %f\n",r1);
			printf("The root is: %f\n",r2);
	}
}
