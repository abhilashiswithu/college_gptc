import java.io.*;
import java.net.*;
public class  UDPserver
{
public static void main(String args [])
{
	try
{
DatagramSocket sktt=new DatagramSocket(3333);
byte[] buf=new byte[1000];
int size=buf.length;
DatagramPacket dp=new DatagramPacket(buf,size);
sktt.receive(dp);
String str=new String(dp.getData());
System.out.println(""+str);
}
catch(Exception e)
{}
}
}
