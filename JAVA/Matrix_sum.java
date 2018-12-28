import java.io.*;
class Matrix_sum
{
	int i,j,k;
	int mrx1[][]= new int[10][10];
	int mrx2[][]= new int[10][10];
	int mrxS[][]= new int[10][10];
	void matrix()throws IOException
	{
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nTo find the sum of two '2x2' Matrices.");
		for(k=0;k<2;k++)
		{
			if(k==0)
			{
				System.out.println("\nEnter the elements to matrix "+(k+1)+" of order (2x2).");
			}
			else if(k==1)
			{
				System.out.println("\nEnter the elements to matrix "+(k+1)+" of order (2x2).");
			}
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					if(k==0)
					{
						mrx1[i][j] = Integer.parseInt(Br.readLine());
					}
					else if(k==1)
					{
						mrx2[i][j] = Integer.parseInt(Br.readLine());
					}
				}
			}
			System.out.print("\n");
			for(i=0;i<2;i++)
			{
				System.out.print("| ");
				for(j=0;j<2;j++)
				{
					if(k==0)
					{
						System.out.print(+mrx1[i][j]+" ");
				}
					else if(k==1)
					{
						System.out.print(+mrx2[i][j]+" ");
					}
				}
				System.out.print("|\n");
			}
		}
		System.out.println("\nSum of two '2x2' Matrices is:");
		for(k=0;k<2;k++)
		{
			if(k==0)
			{
				System.out.print("\n");
			}
			else if(k==1)
			{
				System.out.print("   +\n");
			}
			for(i=0;i<2;i++)
			{
				System.out.print("| ");
				for(j=0;j<2;j++)
				{
					if(k==0)
					{
						System.out.print(+mrx1[i][j]+" ");
				}
					else if(k==1)
					{
						System.out.print(+mrx2[i][j]+" ");
					}
				}
				System.out.print("|\n");
			}
		}
		
	System.out.print("=======\n");
	for(i=0;i<2;i++)
	{
		System.out.print("| ");
		for(j=0;j<2;j++)
		{
			mrxS[i][j] = mrx1[i][j] + mrx2[i][j];
			System.out.print(+mrxS[i][j]+" ");
		}
		System.out.print("|\n");
	}
	}
	public static void main(String args[])throws IOException
	{
		Matrix obj = new Matrix();
		obj.matrix();
	}
}
