import java.io.*;
class Sum_of_digit_class
{
	public static void number()
	{
		int i,num=513,s=0,a;
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
		Sum_of_digit_class n = new Sum_of_digit_class();
		n.number();
	}
}
