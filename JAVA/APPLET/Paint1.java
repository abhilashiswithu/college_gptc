import java.awt.*;
class Paint1 extends Frame
{
	public boolean handleEvent(Event e)
	{
		if(e.id==Event.WINDOW_DESTROY)
			System.exit(0);
			return super.handleEvent(e);
	}
	public void paint (Graphics g)
	{
		Font f = new Font("Impact", Font.PLAIN+Font.ITALIC,24);
		g.setFont(f);
		g.setColor(Color.blue);
		setBackground(Color.orange);
		g.drawString("Hi ! . . . Java",200,300);
	}
	public static void main(String args[])
	{
		Paint1 p = new Paint1();
		p.resize(700,500);
		p.setVisible(true);
		p.setTitle("Welcome");
		
	}
}
