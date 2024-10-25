package oopj24csb40;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class MyTrafficLight extends JFrame implements ActionListener
{
	Color red_c,yellow_c,green_c;
	JRadioButton r1,r2,r3;
	MyTrafficLight()
	{
		r1=new JRadioButton("red");
		r2=new JRadioButton("yellow");
		r3=new JRadioButton("green");
		ButtonGroup gp=new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		JPanel p=new JPanel();
		p.add(r1);
		p.add(r2);
		p.add(r3);
		add(p);
		r1.setBounds(20,20,50,50);
		r2.setBounds(70,20,50,50);
		r3.setBounds(120,20,50,50);
		setVisible(true);
		setSize(400,400);
		red_c=getBackground();
		yellow_c=getBackground();
		green_c=getBackground();
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected())
		{
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
		}
		else if(r2.isSelected())
		{
			red_c=getBackground();
			yellow_c=Color.yellow;
			green_c=getBackground();
		}
		else if(r3.isSelected())
		{
			red_c=getBackground();
			yellow_c=getBackground();
			green_c=Color.green;
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		//this line calls the superclass implemetation of paint method which clears
		//the previous drawings and prepare the component for fresh drawing
		g.drawOval(50,100,50,50);
		g.drawOval(50,160,50,50);
		g.drawOval(50,220,50,50);
		g.setColor(red_c);
		g.fillOval(50, 100, 50, 50);
		g.setColor(yellow_c);
		g.fillOval(50, 160, 50, 50);
		g.setColor(green_c);
		g.fillOval(50, 220, 50, 50);
	}
	public static void main(String args[])
	{
		new MyTrafficLight();
	}
}
