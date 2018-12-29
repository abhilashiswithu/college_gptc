import java.awt.*;
class sample extends Frame
{
	public boolean handleEvent(Event e)
	{
		if(e.id==Event.WINDOW_DESTROY)
			System.exit(0);
			return super.handleEvent(e);
	}
	public static void main(String[]args)
	{
		sample s = new sample();
		s.resize(300,300);
		s.show();
		s.setTitle("WELCOME");
	}
}
