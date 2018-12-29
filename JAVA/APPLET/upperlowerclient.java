import java.net.*;
import java.io.*;
public class upperlowerclient
{
public static void main(String args[])
{
	try
{
Socket s=new Socket("localhost",44444);
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
dos.writeUTF("hello,friend...");
DataInputStream dis=new DataInputStream(s.getInputStream());
String result=dis.readUTF();
System.out.println("message from server"+result);
s.close();
dos.close();
dis.close();
}
catch(Exception ex)
{}
}
}
