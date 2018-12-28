import java.io.*;

class Details
{
	int m1,m2,m3,r,total;
	double per;
	String nam;
	char g;
	void bio() throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter the name");
		nam = Br.readLine();
		System.out.println("Enter the register no.");
		r = Integer.parseInt(Br.readLine());
		System.out.println("Enter the marks of 3 subjects");
		m1 = Integer.parseInt(Br.readLine());
		m2 = Integer.parseInt(Br.readLine());
		m3 = Integer.parseInt(Br.readLine());		
		//System.out.println("Name : "+nam);
		//System.out.println("Register no. : "+r);
		//System.out.println("Marks of 3 subjects out of 100");
		//System.out.println("Subject 1 is : "+m1);
		//System.out.println("Subject 2 is : "+m2);
		//System.out.println("Subject 3 is : "+m3);
	}
}
class Grade extends Details
{
	void total()
	{
		//System.out.println("The marks are : "+m1+",\t"+m2+",\t"+m3);		
		total=m1+m2+m3;
		//System.out.println("The total mark is : "+total);
		per = (total*100)/300;
		//System.out.println("The percentage is :"+per);
	}

	void grade()
	{
		
		if(per>=90) g='S';
		else if(per>=80) g='A';
		else if(per>=70) g='B';
		else if(per>=60) g='C';
		else if(per>=50) g='D';
		else if(per>=40) g='E';
		else g='F';
		//System.out.println("The grade is :"+g);
	}
}
class P_card extends Grade
{
	void card()
	{
		
		System.out.println("___________________________________________");
		System.out.println("|             PROGRESS CARD                |");
		System.out.println("|__________________________________________|");
		System.out.println("| Name         	: "+nam+"                 |");
		System.out.println("| Register No.	: "+r+"                 |");
		System.out.println("| Total Mark	: "+total+"                      |");
		System.out.println("| Percentage	: "+per+"                     |");
		System.out.println("| Grade	        : "+g+"                        |");
		System.out.println("|__________________________________________|");
	}
}
class Student_bio
{
	public static void main(String args[]) throws IOException
	{
		P_card obj = new P_card();
		obj.bio();
		obj.total();
		obj.grade();
		obj.card();
		
	}
}
