import java.io.*;
class Operation_in
{
	double area;
	void circle(int r)
	{
		area = (22/7)*r*r;
		System.out.println("Area of circle with radius "+r+" is: "+area+"\n");
	}
	void rectangle(int l,int b)
	{
		area = l*b;
		System.out.println("Area of rectangle with length "+l+" and breadth "+b+" is: "+area+"\n");
	}
	void triangle(int b, int h)
	{
		area = 0.5*b*h;
		System.out.println("Area of triangle with base "+b+" and height "+h+" is: "+area+"\n");
	}
	public static void main(String args[])throws IOException
	{
		Operation_in obj = new  Operation_in();
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius of the circle\t");
		int p = Integer.parseInt(Br.readLine());
		obj.circle(p);
		System.out.print("Enter the length and breadth of the rectangle respectively\n");
		int x = Integer.parseInt(Br.readLine());
		int y = Integer.parseInt(Br.readLine());
		obj.rectangle(x,y);
		System.out.print("Enter the base and height of the triangle respectively\n");
		int m = Integer.parseInt(Br.readLine());
		int n = Integer.parseInt(Br.readLine());
		obj.triangle(m,n);
	}
}

