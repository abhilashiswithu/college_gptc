import java.io.*;
class Factorial_for_class
{
	public static void numbers()
	{
		int num=5,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
	public static void main(String args[])
	{
		Factorial_for_class object = new Factorial_for_class();
		object.numbers();
	}
}
