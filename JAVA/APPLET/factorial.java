import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="factorial.class" width="300" height="300">
</applet>*/
public class factorial extends Applet implements ActionListener 
{
	Label l1=new Label("Enter the number");
	TextField t1=new TextField(5);
	
	Button b1=new Button("Answer");
	Label l2=new Label("Factorial");
	TextField t2=new TextField(10);
	public void init()
	{
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		add(t2);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			int fact=1, i=1;
			String n=t1.getText();
			int num=Integer.parseInt(n);
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			t2.setText(""+fact);
		}
	}
}

