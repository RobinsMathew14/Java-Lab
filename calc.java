package oobj24cseb63;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Simplecalc implements ActionListener {
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bequ,bclr; 
	JTextField t;
	JPanel p;
	double a,b,result;
	static int operation=0;
	Simplecalc() {
		f    = new JFrame("Calculator");
		p    = new JPanel();
		t    = new JTextField();
		t.setBounds(100,100,200,30);
		f.setSize(400,400);
		b1   = new JButton("1");
		b1.setBounds(100,140,50,30);
		b2   = new JButton("2");
		b2.setBounds(150,140,50,30);
		b3   = new JButton("3");
		b3.setBounds(200,140,50,30);
		b4   = new JButton("4");
		b4.setBounds(100,180,50,30);
		b5   = new JButton("5");
		b5.setBounds(150,180,50,30);
		b6   = new JButton("6");
		b6.setBounds(200,180,50,30);
		b7   = new JButton("7");
		b7.setBounds(100,220,50,30);
		b8   = new JButton("8");
		b8.setBounds(150,220,50,30);
		b9   = new JButton("9");
		b9.setBounds(200,220,50,30);
		b0   = new JButton("0");
		b0.setBounds(100,260,50,30);
		badd = new JButton("+");
		badd.setBounds(250,260,50,30);
		bsub = new JButton("-");
		bsub.setBounds(250,180,50,30);
		bmul = new JButton("*");
		bmul.setBounds(250,220,50,30);
		bdiv = new JButton("/");
		bdiv.setBounds(250,140,50,30);
		bclr = new JButton("c");
		bclr.setBounds(150,260,50,30);
		bequ = new JButton("=");
		bequ.setBounds(200,260,50,30);
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(bequ);
		f.add(bclr);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bclr.addActionListener(this);
		bequ.addActionListener(this);
		bdiv.addActionListener(this);
		
		
		
		
		
		f.setLayout(null);
		f.setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)t.setText(t.getText()+"1");
			if(e.getSource()==b2)t.setText(t.getText()+"2");
			if(e.getSource()==b3)t.setText(t.getText()+"3");
			if(e.getSource()==b4)t.setText(t.getText()+"4");
			if(e.getSource()==b5)t.setText(t.getText()+"5");
			if(e.getSource()==b6)t.setText(t.getText()+"6");
			if(e.getSource()==b7)t.setText(t.getText()+"7");
			if(e.getSource()==b8)t.setText(t.getText()+"8");
			if(e.getSource()==b9)t.setText(t.getText()+"9");
			if(e.getSource()==b0)t.setText(t.getText()+"0");

			
			
			if(e.getSource()==badd) {
				a = Double.parseDouble(t.getText());
				operation=1;
				t.setText("");
			}
			
			if(e.getSource()==bsub) {
				a = Double.parseDouble(t.getText());
				operation=2;
				t.setText("");
			} 
			
			if(e.getSource()==bmul) {
				a = Double.parseDouble(t.getText());
				operation=3;
				t.setText("");
			}
			
			if(e.getSource()==bdiv) {
				a = Double.parseDouble(t.getText());
				operation=4;
				t.setText("");
			}
			
			if(e.getSource()==bequ) {
				b= Double.parseDouble(t.getText());
				try {
				switch(operation) {
				case 1: result=a+b;
				break;
				case 2: result=a-b;
				break;
				case 3: result=a*b;
				break;
				case 4: if(b==0) {
					
				}
				result=a/b;
				break;
				
				 
				
				}
				} catch (Exception et) {
					System.out.println();
				}
				String s=String.valueOf(result);
				t.setText(s);	
				}
			if(e.getSource()==bclr)t.setText(" "); 
				
			
			
			
		}
		
		
		
		
		
		
	
	
	
	public static void main(String[] args) {
		new Simplecalc();
	}

}
