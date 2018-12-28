import java.io.*;
interface Student
{
	void card();
}
class Details
{
	int m[]=new int[4];
	int mm[]=new int[4];
	int mmm[]=new int[4];
	int mmmm[]=new int[4];
	int mmmmm[]=new int[4];
	int r[]=new int[4];
	char g[]=new char[4];
	char g1[]=new char[4];
	char g2[]=new char[4];
	char g3[]=new char[4];
	char g4[]=new char[4];
	String n[]=new String[4];
	String nn[]=new String[4];
	String nnn[]=new String[4];
	String nnnn[]=new String[4];
	String nnnnn[]=new String[4];
	String nam[]=new String[4];
	void bio() throws IOException
	{
		int i,j;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the BIODATA of 4 student");
		for(i=0;i<4;i++)
		{
			System.out.println("\nEnter the name of student "+(i+4));
			nam[i] = Br.readLine();
			System.out.println("Enter the register no. of student "+(i+4));
			r[i] = Integer.parseInt(Br.readLine());
			System.out.println("Enter the subject name and mark of 4 subjects");
			{
				if(i==0)
				{
					for(j=0;j<4;j++)
					{
						nn[j] = Br.readLine();
						mm[j] = Integer.parseInt(Br.readLine());
					}
				}
				else if(i==1)
				{
					for(j=0;j<4;j++)
					{
						nnn[j] = Br.readLine();
						mmm[j] = Integer.parseInt(Br.readLine());
					}
				}
				else if(i==2)
				{
					for(j=0;j<4;j++)
					{
						nnnn[j] = Br.readLine();
						mmmm[j] = Integer.parseInt(Br.readLine());
					}
				}
				else if(i==3)
				{
					for(j=0;j<4;j++)
					{
						nnnnn[j] = Br.readLine();
						mmmmm[j] = Integer.parseInt(Br.readLine());
					}
				}
			}		
		}
	}
}
class Calculation extends Details
{
	void grade_calc()
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			if(i==0)
			{
				m[i] = mm[i];
				g[i] = g[i];
			}
			else if(i==1)
			{
				m[i] = mmm[i];
				g[i] = g2[i];
			}
			else if(i==2)
			{
				m[i] = mmmm[i];
				g[i] = g3[i];
			}
			else if(i==3)
			{
				m[i] = mmmmm[i];
				g[i] = g4[i];
			}
			for(j=0;j<4;j++)
			{
				if(m[j]>=90) g[j]='S';
				else if(m[j]>=80) g[j]='A';
				else if(m[j]>=70) g[j]='B';
				else if(m[j]>=60) g[j]='C';
				else if(m[j]>=50) g[j]='D';
				else if(m[j]>=40) g[j]='E';
				else g[j]='F';
				if(j==0)
				{
					g1[j] = g[j];
				}
				else if(j==1)
				{
					g2[j] = g[j];
				}
				else if(j==2)
				{
					g3[j] = g[j];
				}
				else if(i==3)
				{
					g4[j] = g[j];
				}
			}
		}
	}
}
class Output extends Calculation implements Student
{
	public void card()
	{
		int count,i,j;
		for(i=0;i<4;i++)
		{
			if(i==0)
			{
				n[i] = nn[i];
				g[i] = g1[i];
			}
			else if(i==1)
			{
				n[i] = nnn[i];
				g[i] = g2[i];
			}
			else if(i==2)
			{
				n[i] = nnnn[i];
				g[i] = g3[i];
			}
			else if(i==3)
			{
				n[i] = nnnnn[i];
				g[i] = g4[i];
			}
			System.out.println("\n===========================================");
			System.out.println("|             PROGRESS CARD                |");
			System.out.println("|__________________________________________|");
			System.out.println("|               STUDENT "+(i+1)+"                  |");
			System.out.println("|__________________________________________|");
			System.out.println("| Name         	: "+nam[i]+"                 |");
			System.out.println("| Register No.	: "+r[i]+"                 |");
			System.out.println("|__________________________________________|");
			System.out.println("|        SUBJECT               |  GRADE    |");
			System.out.println("|______________________________|___________|");
			for(j=0;j<4;j++)
			{
				count=j+1;
				System.out.println("| "+count+". "+n[j]+"                       ||    "+g[j]+"      |");
			}  
			System.out.println("|==============================|===========|");
		}
	}
}
class Interface_Progress_card
{
	public static void main(String args[]) throws IOException
	{
		Output obj = new Output();
		obj.bio();
		obj.grade_calc();
		obj.card();	
	}
}
