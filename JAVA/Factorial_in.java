import java.io.*;
class Factorial_in
{
	public int num;
	Factorial_in(int x)
	{
		num=x;
	}
	 void numbers(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}
	public static void main(String args[])throws IOException
	{
		Factorial_in obj = new Factorial_in(0);
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number ");
		int nu = Integer.parseInt(Br.readLine());
		obj.numbers(nu);
	}
}
