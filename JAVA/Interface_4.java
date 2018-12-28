import java.lang.*;
import java.io.*;
interface Exam
{
	void percent_cal();
}
class Student
{
	String name;
	int roll_no,mark1,mark2;
	void getdata()throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter the name");
		name = Br.readLine();
		System.out.println("\nEnter the Roll No.");
		roll_no = Integer.parseInt(Br.readLine());
		System.out.println("\nEnter the marks of 2 subjects");
		mark1 = Integer.parseInt(Br.readLine());
		mark2 = Integer.parseInt(Br.readLine());		
	}
	void display()
	{
		System.out.println("\nName of Student : "+name);
		System.out.println("Roll No. of Student : "+roll_no);
		System.out.println("Marks of Subject 1 : "+mark1);
		System.out.println("Marks of Subject 2 : "+mark2);
	}
}
class Result extends Student implements Exam
{
	public void percent_cal()
	{
		int total = (mark1+mark2);
		float percent = total*100/200;
		System.out.println("Total Mark : "+total);
		System.out.println("Percentage  : "+percent+"%");
	}
	void display()
	{
		super.display();
	}
}
class Interface_4
{
	public static void main(String args [])throws IOException
	{
		Result R = new Result();
		R.getdata();
		R.display();
		R.percent_cal();
	}
}
