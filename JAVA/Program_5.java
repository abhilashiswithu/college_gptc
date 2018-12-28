import java.io.*;
class Array
{
	int num[]= new int[50];
	int i,n;
	double avg,sum;
	void Input()throws IOException
	{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter how many number your going to input (maximum 50).");
		n = Integer.parseInt(Br.readLine());
		System.out.println("\nPlease enter the numbers one by one.");
		for(i=0;i<n;i++)
		{
			num[i] = Integer.parseInt(Br.readLine());
		}		
	}
	void Sum_Average()
	{
		sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+num[i];
			avg=sum/n;
		}
			System.out.println("\nThe sum  of elements in the array is : "+sum+".\n");
			System.out.println("The average of elements in the array is :"+avg+".\n");	
	}
	void Search()throws IOException
	{
		int f=0,m=0;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter the element to be search.");
		int snum = Integer.parseInt(Br.readLine());
		for(i=0;i<n;i++)
		{
			if(num[i]==snum)
			{
				f=1;
				m=i+1;		
				break;
			}
			else
			{
				f=0;
			}
			
		}		
		if(f==1)
		{
			System.out.println("\nThe element "+snum+" is at "+m+" th position in the array.");
		}
		else
		{
			System.out.println("\nSORRY! The element "+snum+" is not in the array.");
		}
		
	}
	void S_largest()
	{
		int j,TEMP;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-1);j++)
			{
				if(num[i]<num[j])
				{
					TEMP= num[i];
					num[i]=num[j];
					num[j]=TEMP;
				}
			}
		}
		System.out.println("\nSecond Largest element is: "+num[n-2]);
	}
}
class Program_5
{
	public static void main(String args[])throws IOException
	{
		int z;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n             MENU\n");
		System.out.println("1. Second Largest element in the array.");
		System.out.println("2. Search an element in the array.");
		System.out.println("3. The sum and average of the elements in the array.\n");
		Array obj = new Array();
		do{
			System.out.println("Enter the choice.");
			int c = Integer.parseInt(Br.readLine());
			obj.Input();
			{
				switch(c)
				{
					case 1:
							obj.S_largest();
							break;
					case 2:
							obj.Search();
							break;
					case 3:
							obj.Sum_Average();
							break;
					default:
							System.out.println("\nSORRY! Invalid choice.");
				}
			}
		
			System.out.println("\nEnter '8' to continue the program, or enter any other number to terminate the program.\n");
			z = Integer.parseInt(Br.readLine());
	  }while(z==8);
	}
}
