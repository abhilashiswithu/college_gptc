import java.awt.*;
class Button1 extends Frame
{
	public Button1()
	{
		setTitle("BUTTON TEST");
		setLayout(new FlowLayout());
		add(new Button("Green"));
		add(new Button("Blue"));
		add(new Button("Orange"));
	}
	public boolean handleEvent (Event e)
	{
		if(e.id==Event.WINDOW_DESTROY)
			System.exit(0);
			return super.handleEvent (e);
	}
	public boolean action (Event evt, Object arg)
	{
		if(arg.equals("Green"))
			setBackground(Color.green);
		else if(arg.equals("Blue"))
			setBackground(Color.blue);
		else if(arg.equals("Orange"))
			setBackground(Color.orange);
		else
			return super.action(evt, arg);
		repaint();
		return true;
	}
	public static void main(String args[])
	{
		Frame b = new Button1();
		b.resize(700,500);
		b.setVisible(true);
		b.setTitle("Welcome");
		
	}
}
