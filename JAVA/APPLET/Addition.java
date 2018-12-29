import java.awt.*;
class Addition extends Frame
{
	public boolean handleEvent (Event e)
	{
		if(e.id==Event.WINDOW_DESTROY)
			System.exit(0);
			return super.handleEvent (e);
	}
	public void paint (Graphics g)
	{
		int a=7, b=7;
		int c=a+b;
		
		Font f = new Font("Impact", Font.PLAIN+Font.ITALIC,24);
		g.setFont(f);
		g.setColor(Color.blue);
		setBackground(Color.orange);
		g.drawString("Sum of "+a+" and "+b+" = "+c,200,200);
	}
	public static void main(String args[])
	{
		Frame b = new Addition();
		b.resize(700,500);
		b.setVisible(true);
		b.setTitle("Welcome");
		
	}
}
