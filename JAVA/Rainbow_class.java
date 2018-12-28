import java.io.*;
class Rainbow
{
	void colour()
	{
		char ch;
		ch='r';		
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
class Rainbow_class
{
	public static void main(String args[])
	{
		Rainbow obj = new Rainbow();
		obj.colour();
	}
}

