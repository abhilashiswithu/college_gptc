import java.net.*;
public class Client
{
	public static void main(String [] args)
	{
		try{
			Socket so=new Socket("localhost",3333);
		}
		catch(Exception e)
		{
		}
	}
}
