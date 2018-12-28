import java.io.*;
class Natural_number
{
	void number(int num)
	{
		int i,s=0;
		for(i=0;i<=num;i++)
		{
			s=s+i;
		}
		System.out.println("Sum of Natural number 1 to "+num+" is: "+s);
	}
}
class Program_3
{
	public static void main(String args[])
	{
		Natural_number n = new Natural_number();
		n.number(5);
	}
}
