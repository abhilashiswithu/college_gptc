import java.io.*;
class Rainbow1
{
	void colour(char ch)
	{
		switch(ch)
		{
			case 'v':
						System.out.println("Colour is 'VIOLET'");
						break;
			case 'i':
						System.out.println("Colour is 'INDIGO'");
						break;
			case 'b':
						System.out.println("Colour is 'BLUE'");
						break;
			case 'g':
						System.out.println("Colour is 'GREEN'");
						break;
			case 'y':
						System.out.println("Colour is 'YELLOW'");
						break;
			case 'o':
						System.out.println("Colour is 'ORANGE'");
						break;
			case 'r':
						System.out.println("Colour is 'RED'");
						break;
			default:
						System.out.println("Invalid key");
		}
	}
}
class Program_2
{
	public static void main(String args[])
	{
		char ch;
		ch='r';
		System.out.println("This program is to display the colour of the rainbow\n");
		Rainbow1 obj =new Rainbow1();
		obj.colour(ch);
	}
}
