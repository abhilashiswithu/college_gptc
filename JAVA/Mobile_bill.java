import java.io.*;
class Data
{
	int sec[]=new int[10];
	int sms[]=new int[10];
	double sec1[]=new double[10];
	double Rs[]=new double[10];
	double Rs1[]=new double[10];
	double Rs2[]=new double[10]; 
	String a[]=new String[10];
	int SEC=0,SMS=0,i;
	double rs=0;
	String name,no;
	void Input()throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n                Bharat Sarkar Nigam Limited");
		System.out.println("\nInput the details of call duration and sms of a week, one by one.\n");	
		System.out.println("Please enter the CUSTOMER NAME");
		name = Br.readLine();
		System.out.println("Please enter the MOBILE NO.");
		no = Br.readLine();
		a[0]="SUNDAY";
		a[1]="MONDAY";
		a[2]="TUESNDAY";
		a[3]="WEDNESDAY";
		a[4]="THURSDAY";
		a[5]="FRIDAY";
		a[6]="SATURDAY";
		for(i=0;i<7;i++)
		{
			System.out.println("Enter the CALL DURATION in "+a[i]+" (in seconds).");
			sec[i] = Integer.parseInt(Br.readLine());
			System.out.println("Enter the number of SMS sended in "+a[i]+" (in number).");
			sms[i] = Integer.parseInt(Br.readLine());
		}	
	}
}
class Calculation extends Data
{
	void calc()
	{
		for(i=0;i<7;i++)
		{
			if(sec[i]<=600)
			{
				Rs1[i]= 0;
			}
			else
			{
				sec1[i]=sec[i]-600;
				Rs1[i]=sec1[i]*1.5;
			}
			if(sms[i]>0)
			{
				Rs2[i]=sms[i];
			}
			SEC=SEC+sec[i];
			SMS=SMS+sms[i];
			Rs[i] = (Rs1[i]/100) + Rs2[i];
			rs=rs+Rs[i];
		}
	}
}
class Bill extends Calculation
{
	void bill()
	{
		
		System.out.println("___________________________________________");
		System.out.println("|         Bharat Sarkar Nigam Limited      |");
		System.out.println("|__________________________________________|");
		System.out.println("|               MOBILE BILL                |");
		System.out.println("|__________________________________________|");
		System.out.println("| Customer Name       : "+name);
		System.out.println("| Mobile No.	      : "+no);
		System.out.println("| Total call duration : "+SEC+" sec.");
		System.out.println("| Total SMS sended    : "+SMS);
		System.out.println("|__________________________________________|");
		System.out.println("|       Total Amount        | Rs."+rs);
		System.out.println("|___________________________|______________|");
	}
}
class Mobile_bill
{
	public static void main(String args[])throws IOException
	{
		Bill obj = new Bill();
		obj.Input();
		obj.calc();
		obj.bill();
		
	}
}
