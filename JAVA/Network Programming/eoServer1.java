import java.io.*;
import java.net.*;
public class eoServer
{
	public static void main(String args[])
	{
		try{
			ServerSocket skt=new ServerSocket(33221);
			System.out.println("Server is listening...");

			Socket s=skt.accept();
			System.out.println("Connection Successfully");
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str1=dis.readUTF();
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			int num=Integer.parseInt(str1);
			System.out.println("Number from client : "+num);
			if(num%2==0)
			{
				dos.writeUTF("Even");
			}
			else
			{
				dos.writeUTF("Odd");
			}
			skt.close();
			s.close();
			dis.close();
		}
		catch(Exception e)
		{
		}
	}
}
