import java.io.*;
class Operation
{
	int num;
	Operation(int n)
	{
		num=n;
	}
	void Reverse()
	{
		int i,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s*10+a;
			num=num/10;
		}
		System.out.println("\nReverse of "+i+" is: "+s);
	}
	void Sum()
	{
		int i,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s+a;
			num=num/10;
		}
		System.out.println("\nSum of digits of "+i+" is: "+s);
	}
}
class Program_4
{
	public static void main(String args[])throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n         MENU\n");
		System.out.println("1. Reverse of a number.");
		System.out.println("2. Sum of digit of a number.\n");
		System.out.println("Enter the choice.");
		int c = Integer.parseInt(Br.readLine());
		System.out.println("\nEnter the number.");
		int a = Integer.parseInt(Br.readLine());
		Operation obj1 = new Operation(a);
		Operation obj2 = new Operation(a);
		switch(c)
		{
			case 1:
					obj1.Reverse();
					break;
			case 2:
					obj2.Sum();
					break;
			default:
					System.out.println("\nSORRY! Invalid choice.");
		}
		
		
	}
}
