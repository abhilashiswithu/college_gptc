import java.net.*;
public class Server
{
	public static void main(String [] args)
	{
		try{
			ServerSocket svr=new ServerSocket(3333);
			System.out.println("Server is listening.....");
			Socket st=svr.accept();
			System.out.println("Connection established.....");
		}
		catch(Exception e)
		{
		}
	}
}
