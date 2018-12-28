import java.io.*;
class A
{
	int a;
	int b;
	A( int x,int y)
	{
		a = x;
		b = y;
	}
	int sum1()
	{
		return(a+b);
	}
}
class B extends A
{
	int c;
	int d;
	B(int x, int y, int r, int s)
	{
		super(x,y); //Invokes the constructor of base class
		c = r;
		d = s;
	}
	int sum2()
	{
		return(a+b+c+d);
	}
}
class Inheritance_class
{
	public static void main(String args[])
	{
		//A obj1 = new A(10,10);
		B obj2 = new B(10,10,10,10);
		int n = obj2.sum1();
		System.out.println("The sum is "+n);
		int m = obj2.sum2();
		System.out.println("The sum is "+m+"\n");
	}	
}
