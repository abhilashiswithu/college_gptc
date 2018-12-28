import java.io.*;
class Reverse
{
	public static void main(String args[])
	{
		int i,num=513,s=0,a;
		i=num;
		while(num>0)
		{
			a=num%10;
			s=s*10+a;
			num=num/10;
		}
		System.out.println("Sum of digits of "+i+" is: "+s);
	}
}
