import java.io.*;
import java.net.*;
public class URLInputStream
{
	public static void main(String [] args)
	{
		try{
				URL u=new URL("http://www.tekerala.org");
				URLConnection urlcon=u.openConnection();
				InputStream stream=urlcon.getInputStream();
				int i;
				while((i=stream.read())!=-1)
				{
					System.out.println((char)i);
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
