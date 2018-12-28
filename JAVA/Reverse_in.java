import java.io.*;
class Reverse_in
{
	int n;
	Reverse_in(int a)
	{
		n=a;
	}
	void number(int num)
	{
		int i,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s*10+a;
			num=num/10;
		}
		System.out.println("Reverse of "+i+" is: "+s);
	}
	public static void main(String args[])throws IOException
	{
		Reverse_in obj = new  Reverse_in(0);
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number with 2 or more digit to find its reverse\t");
		int b = Integer.parseInt(Br.readLine());
		obj.number(b);
	}
}
