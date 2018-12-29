import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Sum_app.class" width="400" height="400">
</applet>*/
public class Sum_app extends Applet implements ActionListener 
{
	Label l1=new Label("Enter the 2 number");
	TextField t1=new TextField(5);
	TextField t2=new TextField(5);
	Button b1=new Button("Answer");
	Label l2=new Label("Sum");
	TextField t3=new TextField(5);
	public void init()
	{
		add(l1);
		add(t1);
		add(t2);
		add(b1);
		add(l2);
		add(t3);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			int c;
			String n1=t1.getText();
			String n2=t2.getText();
			int num1=Integer.parseInt(n1);
			int num2=Integer.parseInt(n2);
			c=num1+num2;
			t3.setText(""+c);
		}
	}
}

