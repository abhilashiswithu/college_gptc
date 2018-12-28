import java.io.*;
class Largest_class
{
	public static void number()
	{
		int a=23,b=32,c=43;
		if((a>b)&&(a>c))
		{
			System.out.println("The largest number is "+a);
		}
		else
		{
			if(b>c)
			{
				System.out.println("The largest number is "+b);
			}
			else
			{
				System.out.println("The largest number is "+c);
			}
		}
	}
	public static void main(String args[])
	{
		Largest_class n = new Largest_class();
		n.number();
	}
}
