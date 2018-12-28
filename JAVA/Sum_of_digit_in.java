import java.io.*;
class Sum_of_digit_in
{
	int n;
	Sum_of_digit_in(int a)
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
			s=s+a;
			num=num/10;
		}
		System.out.println("Sum of digits of "+i+" is: "+s);
		System.out.println(" ");
	}
	public static void main(String args[])throws IOException
	{
		Sum_of_digit_in obj = new Sum_of_digit_in(0);
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number to find the sum of digit\t");
		int b = Integer.parseInt(Br.readLine());
		obj.number(b);
	}
}
