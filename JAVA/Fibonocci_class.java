import java.io.*;
class Fibonocci_class
{
	public static void number()
	{
		int num=15,b=0,a=0,c=1;
		System.out.println("The Fibonocci series of "+num+" is:");
		System.out.print(+a);
		System.out.print("\t"+b);
		while(c<=num)
		{
			System.out.print("\t"+c);
			a=b;
			b=c;
			c=a+b;	
		}
	}
	public static void main(String args[])
	{
		Fibonocci_class n = new Fibonocci_class();
		n.number();
	}
}
