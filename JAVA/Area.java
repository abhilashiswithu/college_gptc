import java.io.*;
class Area
{
	int l;
	int b;	
	Area(int x,int y)
	{
		l=x;b=y;
	}
	
	 int area_cal()
	{
		return(l*b);
		
		
}
	public static void main(String args[])
	{
	Area obj = new Area(15,10);
	int a=obj.area_cal();
	System.out.println("area is "+a);
	
}

}

