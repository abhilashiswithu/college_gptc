import java.net.*;
import java.io.*;
public class  UDPclient
{
public static void main(String args [])
{
	try
{
System.out.println("enter the string:");
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
String str=br.readLine();
byte[] data=str.getBytes();
int len =data.length;
System.out.println(""+len+"");
InetAddress ip=InetAddress.getByName("localhost");
int port=3333;
DatagramPacket dp=new DatagramPacket(data,len,ip,port);
DatagramSocket skt=new DatagramSocket();
skt.send(dp);
}
catch(Exception  e) 
{}
}
}
