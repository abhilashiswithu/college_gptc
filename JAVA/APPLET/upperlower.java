import java.net.*;
import java.io.*;
public class upperlower
{
public static void main(String args [])
{
	try
{
ServerSocket SSock=new ServerSocket(44444);
System.out.println("Server is listening");
Socket s=SSock.accept();
System.out.println("connection established....");
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=dis.readUTF();
System.out.println("String from client is"+str);
System.out.println("convert message"+str.toUpperCase());
String result=str.toUpperCase();
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
dos.writeUTF(""+result);
dos.close();
dis.close();
SSock.close();
s.close();
}
catch(Exception ex)
{
}
}
}
