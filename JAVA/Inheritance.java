import java.io.*;
class A
{
	int sum1(int a,int b)
	{
		return(a+b);
	}
}
class B
{
	int sum2(int a,int b,int c,int d)
	{
		return(a+b+c+d);
	}
}
class Inheritance
{
	public static void main(String args[])throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2  numbers");
		int n1 = Integer.parseInt(Br.readLine());
		int n2 = Integer.parseInt(Br.readLine());
		A obj1 = new A();
		int n = obj1.sum1(n1,n2);
		System.out.println("The sum is "+n);
		System.out.println("Enter 4  numbers");
		int n3 = Integer.parseInt(Br.readLine());
		int n4 = Integer.parseInt(Br.readLine());
		//int n5 = Integer.parseInt(Br.readLine());
		//int n6 = Integer.parseInt(Br.readLine());
		B obj2 = new B();
		int m = obj2.sum2(n1,n2,n3,n4);
		System.out.println("The sum is "+m+"\n");
	}	
}
