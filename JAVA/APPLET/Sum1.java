import java.awt.*;
class Sum1 extends Frame
{
	public Sum1()
	{
		setTitle("BUTTON TEST");
		setLayout(new FlowLayout());
		int n1=add(new TextField("0"));
		int n2=add(new TextField("0"));
		add(new Button("ADD"));
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
		else
			return super.action(evt, arg);
		repaint();
		return true;
	}
	public static void main(String args[])
	{
		Frame s = new Sum1();
		s.resize(700,500);
		s.setVisible(true);
		s.setTitle("Welcome");
		
	}
}
