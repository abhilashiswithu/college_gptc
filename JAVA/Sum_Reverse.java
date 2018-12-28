import java.io.*;
class Sum_Reverse
{
	public static void Reverse()
	{
		int i,num=3652,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s*10+a;
			num=num/10;
		}
		System.out.println("Reverse of "+i+" is: "+s);
	}
	public static void number()
	{
		int i,num=3652,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s+a;
			num=num/10;
		}
		System.out.println("Sum of digits of "+i+" is: "+s);
	}
	public static void main(String args[])
	{
		Sum_Reverse obj = new Sum_Reverse();
		obj.Reverse();
	}
}
