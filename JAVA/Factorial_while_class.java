import java.io.*;
class Factorial_while_class
{
	public static void number()
	{
		int num=5, i=1,fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i=i+1;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
	public static void main(String args[])
	{
		Factorial_while_class obj = new Factorial_while_class();
		obj.number();
	}
}
