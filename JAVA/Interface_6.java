import java.io.*;
interface Calc1
{
	void add(int a, int b);
}
interface Calc2
{
	void sub(int a, int b);
}
class Operation implements Calc1, Calc2
{
	public void add(int a, int b)
	{
		int s=a+b;
		System.out.println("Sum = "+s);
	}
	public void sub(int c, int d)
	{
		int sb=c-d;
		System.out.println("Difference = "+sb);
	}
}

class Interface_6
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers to find its sum.");
		int num1 = Integer.parseInt(Br.readLine());
		int num2 = Integer.parseInt(Br.readLine());
		Operation obj = new Operation();
		obj.add(num1,num2);
		System.out.println("Enter 2 numbers to find its difference.");
		int num3 = Integer.parseInt(Br.readLine());
		int num4 = Integer.parseInt(Br.readLine());
		obj.sub(num3,num4);
	}
}
