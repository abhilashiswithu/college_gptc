import java.io.*;
import java.net.*;
public class eoClient
{
	public static void main(String args[])
	{
	try
	{
		Socket s=new Socket("localhost",33221);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		String str1=br.readLine();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF(str1);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String result=dis.readUTF();
		System.out.println("Result:"+result);
	}
	catch(Exception e)
	{
	}
	}
}
