import java.io.*;
class Area1
{
	int l;
	int b;	
	Area1()
	{
		l=10;b=10;
	}
	
	 int area_cal()
	{
		return(l*b);
		
		
}
	public static void main(String args[])
	{
	Area1 obj = new Area1();
	int a=obj.area_cal();
	System.out.println("area is "+a);
	
}

}

