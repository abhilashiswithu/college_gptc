import java.io.*;
class Type
{	
	final static int pi=(22/7);
	 void circle()
	{
		int r=4, pi=2;
		int a=pi*r*r;
		System.out.println("area is "+a);
	}
	
}
class Final
{
	public static void main(String args[])
	{
	Type obj = new Type();
	obj.circle();
	
	}

}

