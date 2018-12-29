import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="biodata.class" width="400" height="400">
</applet>*/
public class biodata extends Applet implements ActionListener 
{
	Label l1=new Label("Name:");
	TextField t1=new TextField(5);
	Label l2=new Label("Address:");
	TextField t2=new TextField(5);
	Label l3=new Label("DOB:");
	TextField t3=new TextField(5);
	Label l4=new Label("Age:");
	TextField t4=new TextField(5);
	Label l5=new Label("Gender:");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox Male;
	Checkbox Female;
	Label l6=new Label("Nationality:");
	Choice chh=new Choice();
	Label l7=new Label("Language Known:");
	
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	Checkbox cb4;
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Button b1=new Button("Sumbit");
	TextArea ta =new TextArea(10,5);
	
	public void init()
	{
		setLayout(new GridLayout(8,2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		Male=new Checkbox("MALE",cbg,true);
		Female=new Checkbox("FEMALE",cbg,true);
		p1.add(Male);
		p1.add(Female);
		add(p1);
		add(l6);
		chh.addItem("select");
		chh.addItem("India");
		chh.addItem("Other");
		add(chh);
		add(l7);
		cb1 = new Checkbox("Malayalam");
		cb2 = new Checkbox("English");
		cb3 = new Checkbox("Hindi");
		cb4 = new Checkbox("Tamil");
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		add(p2);
		p3.add(b1);
		add(p3);
		add(ta);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String nam=t1.getText();
			String ads=t2.getText();
			String dob=t3.getText();
			String age=t4.getText();
			String nat=chh.getSelectedItem();
			//String ge=cbg.getSelected();
			ta.setText("Name:"+nam+"\nAddress:"+ads+"\nDOB:"+dob+"\nAge:"+age+"\nNationality:"+nat);
		}
	}
}

