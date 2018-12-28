import java.io.*;
class Rainbow_in
{
	void colour(String ch)
	{
		switch(ch)
		{
			case "v":
					{
						System.out.println("Colour is 'VIOLET'");
						break;
					}
			case "i":
					{
						System.out.println("Colour is 'INDIGO'");
						break;
					}
			case "b":
					{
						System.out.println("Colour is 'BLUE'");
						break;
					}
			case "g":
					{
						System.out.println("Colour is 'GREEN'");
						break;
					}
			case "y":
					{
						System.out.println("Colour is 'YELLOW'");
						break;
					}
			case "o":
					{
						System.out.println("Colour is 'ORANGE'");
						break;
					}
			case "r":
					{
						System.out.println("Colour is 'RED'");
						break;
					}
			default:
					{
						System.out.println("Invalid key");
					}
		}
	}

	public static void main(String args[])throws IOException
	{
		Rainbow_in obj = new  Rainbow_in();
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first letter of any rainbow colour (in lower case letter)");
		String c = Br.readLine();
		obj.colour(c);
		
	}
}
