import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Calculator.class" width=250 height=200>
</applet>*/

public class Calculator extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	public void init()
	{
		setVisible(true);
		l1=new Label("calculator");
		l2=new Label("Enter the first number");
		l3=new Label("Enter the second number");
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(t3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}		
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int ans=n1+n2;
		t3.setText(Integer.toString(ans));
	}
	if(e.getSource()==b2)
	{
		
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int ans=n1-n2;
		t3.setText(Integer.toString(ans));
	}
	if(e.getSource()==b3)
	{
		
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int ans=n1*n2;
		t3.setText(Integer.toString(ans));
	}
	if(e.getSource()==b4)
	{
		
		float n1=Float.parseFloat(t1.getText());
		float n2=Float.parseFloat(t2.getText());
		float ans=n1/n2;
		t3.setText(Float.toString(ans));
	}	
		
}
}

