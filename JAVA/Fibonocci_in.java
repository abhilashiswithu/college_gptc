import java.io.*;
class Fibonocci_in
{
	int n;
	Fibonocci_in(int a)
	{
		n=a;
	}
	void number(int num)
	{
		int b=0,a=0,c=1;
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
		System.out.println(" ");
	}
	public static void main(String args[])throws IOException
	{
		Fibonocci_in obj = new Fibonocci_in(0);
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number ");
		int b = Integer.parseInt(Br.readLine());
		obj.number(b);
	}
}
