import java.io.*;
class Data
{
	int cr,pr,unit,unit1;
	double Rs,Rs1,Rs2,Rs3;
	String name,n;
	void Input() throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the CONSUMER NO.");
		n = Br.readLine();		
		System.out.println("Enter the NAME");
		name = Br.readLine();
		System.out.println("Enter the CURRENT READING (shown in meter)");
		cr = Integer.parseInt(Br.readLine());
		System.out.println("Enter the PREVIOUS READING (shown in meter)");
		pr = Integer.parseInt(Br.readLine());
		
	}
}
class Condition extends Data
{
	void calc()
	{
		unit= cr-pr;
		
		if(unit<100)
		{
			Rs= (unit)*1.50;
		}
		else if(unit<250)
		{
			unit1=(unit)-100;
			Rs1= 100*1.50;
			Rs2= (unit1)*2.50;
			Rs=Rs1+Rs2;
		}
		else if(unit>250)
		{
			unit1= (unit)-250;
			Rs1= 100*1.50;
			Rs2= 150*2.50;
			Rs3= (unit1)*4;
			Rs= Rs1+Rs2+Rs3




;
			
		}
	}
}
class Bill extends Condition
{
	void bill()
	{
		
		System.out.println("___________________________________________");
		System.out.println("|        Kerala State Electricity Board    |");
		System.out.println("|__________________________________________|");
		System.out.println("|            ELECTRICITY BILL              |");
		System.out.println("|__________________________________________|");
		System.out.println("| Consumer No.	  : "+n);
		System.out.println("| Name         	  : "+name);
		System.out.println("| Current Reading : "+cr);
		System.out.println("| Previous Reading: "+pr);
		System.out.println("| Usage current   : "+unit);
		System.out.println("|__________________________________________|");
		System.out.println("|       Total Amount        | "+Rs);
		System.out.println("|___________________________|______________|");
	}
}
class Electricity_bill
{
	public static void main(String args[]) throws IOException
	{
		Bill obj = new Bill();
		obj.Input();
		obj.calc();
		obj.bill();
		
	}
}
