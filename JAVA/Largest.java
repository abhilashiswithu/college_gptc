import java.io.*;
class Largest
{
	public static void main(String args[])	
	{
		int a=23,b=32,c=43;
		if((a>b)&&(a>c))
		{
			System.out.println("The largest number is "+a+" out of "+b+" and "+c);
		}
		else
		{
			if(b>c)
			{
				System.out.println("The largest number is "+b+" out of "+a+" and "+c);
			}
			else
			{
				System.out.println("The largest number is "+c+" out of "+a+" and "+b);
			}
		}
	}

}
