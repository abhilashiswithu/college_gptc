import java.io.*;
class Reverse_class
{
	public static void number()
	{
		int i,num=3413,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s*10+a;
			num=num/10;
		}
		System.out.println("Reverse of "+i+" is: "+s);
	}
	public static void main(String args[])
	{
		Reverse_class n = new  Reverse_class();
		n.number();
	}
}
