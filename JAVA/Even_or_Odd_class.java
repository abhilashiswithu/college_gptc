import java.io.*;
class Even_or_Odd_class
{
	public static void number()
	{
		int a=23;
		if(a%2==0)
		{
			System.out.println("The number "+a+" is EVEN");
		}
		else
		{
			System.out.println("The number "+a+" is ODD");
		}
	}
	public static void main(String args[])
	{
		Even_or_Odd_class n = new Even_or_Odd_class();
		n.number();
	}
}
