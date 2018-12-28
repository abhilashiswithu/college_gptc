import java.io.*;
interface Calc
{
	void add(int a, int b);
}
class Operation implements Calc
{
	public void add(int a, int b)
	{
		int s=a+b;
		System.out.println("Sum = "+s);
	}
}

class Interface_5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers to find its sum.");
		int num1 = Integer.parseInt(Br.readLine());
		int num2 = Integer.parseInt(Br.readLine());
		Operation obj = new Operation();
		obj.add(num1,num2);
	}
}
