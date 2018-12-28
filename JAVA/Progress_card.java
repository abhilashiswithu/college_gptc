import java.io.*;

class Details
{
	int r,count,i;
	int m[]=new int[4];
	char g[]=new char[4];
	String n[]=new String[4];
	String nam;
	void bio() throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter the name");
		nam = Br.readLine();
		System.out.println("Enter the register no.");
		r = Integer.parseInt(Br.readLine());
		System.out.println("Enter the name and mark of 4 subjects");
		for(int i=0;i<4;i++)
		{
			n[i] = Br.readLine();
			m[i] = Integer.parseInt(Br.readLine());
		}
	}
}
class Grade extends Details
{
	void grade()
	{
		for(i=0;i<4;i++)
		{
			if(m[i]>=90) g[i]='S';
			else if(m[i]>=80) g[i]='A';
			else if(m[i]>=70) g[i]='B';
			else if(m[i]>=60) g[i]='C';
			else if(m[i]>=50) g[i]='D';
			else if(m[i]>=40) g[i]='E';
			else g[i]='F';
		}
	}
}
class Output extends Grade
{
	void card()
	{
		
		System.out.println("___________________________________________");
		System.out.println("|             PROGRESS CARD                |");
		System.out.println("|__________________________________________|");
		System.out.println("| Name         	: "+nam+"                 |");
		System.out.println("| Register No.	: "+r+"                 |");
		System.out.println("|__________________________________________|");
		System.out.println("|        SUBJECT               |  GRADE    |");
		System.out.println("|______________________________|___________|");
		for(i=0;i<4;i++)
		{
			count=i+1;
		System.out.println("| "+count+". "+n[i]+"                       ||    "+g[i]+"      |");
		}  
		System.out.println("|______________________________|___________|");
	}
}
class Progress_card
{
	public static void main(String args[]) throws IOException
	{
		Output obj = new Output();
		obj.bio();
		obj.grade();
		obj.card();	
	}
}
