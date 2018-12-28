import java.io.*;
class All_Operations
{
	public static void Even_or_Odd()
	{
		int a=23;
		if(a%2==0)
		{
			System.out.println("The number "+a+" is EVEN");
		}
		else
		{
			System.out.println("The number "+a+" is ODD");
		}
	}
	public static void Factorial_for()
	{
		int num=5,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
	public static void Factorial_while()
	{
		int num=5, i=1,fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i=i+1;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
	
	public static void Fibonocci()
	{
		int num=15,b=0,a=0,c=1;
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
	}
	public static void Largest()	
	{
		int a=23,b=32,c=43;
		if((a>b)&&(a>c))
		{
			System.out.println("\nThe largest number is "+a+" out of "+b+" and "+c);
		}
		else
		{
			if(b>c)
			{
				System.out.println("\nThe largest number is "+b+" out of "+a+" and "+c);
			}
			else
			{
				System.out.println("\nThe largest number is "+c+" out of "+a+" and "+b);
			}
		}
	}
	public static void Sum_of_Natural()
	{
		int i,num=5,s=0;
		for(i=0;i<=num;i++)
		{
			s=s+i;
		}
		System.out.println("Sum of Natural number 0 to "+num+" is: "+s);
	}
	public static void Rainbow()
	{
		char ch;
		ch='r';
		switch(ch)
		{
			case 'v':
					{
						System.out.println("colour is 'VIOLET'");
						break;
					}
			case 'i':
					{
						System.out.println("colour is 'INDIGO'");
						break;
					}
			case 'b':
					{
						System.out.println("colour is 'BLUE'");
						break;
					}
			case 'g':
					{
						System.out.println("colour is 'GREEN'");
						break;
					}
			case 'y':
					{
						System.out.println("colour is 'YELLOW'");
						break;
					}
			case 'o':
					{
						System.out.println("colour is 'ORANGE'");
						break;
					}
			case 'r':
					{
						System.out.println("colour is 'RED'");
						break;
					}
			default:
					{
						System.out.println("Invalid key");
					}
		}
	}
	public static void Reverse()
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
	public static void Sample()
	{
		System.out.println("Hellooo ");
		System.out.println("Welcome to JAVA programming ");
		
	}
	public static void Sum()
	{
		int a,b,s;
		a=43;
		b=22;
		s=a+b;
		System.out.println("Sum ofthe number "+a+" and "+b+" is: "+s);
	}
	public static void Sum_of_digit()
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
		All_Operations O = new All_Operations();
		O.Sample();
		O.Even_or_Odd();
		O.Factorial_for();
		O.Factorial_while();
		O.Fibonocci();
		O.Largest();
		O.Sum_of_Natural();
		O.Rainbow();
		O.Reverse();
		O.Sum();
		O.Sum_of_digit();
		
	}
}
