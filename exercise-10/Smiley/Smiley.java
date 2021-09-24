/*
4. Find the percentage of marks obtained by a student in 5 subjects.
Display a happy face if he secures above 50% or a sad face if
otherwise.
*/

import java.awt.*;
import java.awt.event.*;

public class Smiley extends Frame implements ActionListener{
	TextField adbms,acn,c,oop,network;

	public Smiley(){
		//use flow layout
		setLayout(new FlowLayout());

		//create controls
		Label adbmsn=new Label("adbms ");
		Label acnn=new Label("acn ");
		Label cn=new Label("c program ");
		Label oopn=new Label("oop");
		Label networkn=new Label("network ");


		adbms = new TextField("0");
		acn = new TextField("0");
		c = new TextField("0");
		oop = new TextField("0");
		network = new TextField("0");
		

		//add controls to frame
		add(adbmsn);
		add(adbms);
		add(acnn);
		add(acn);
		add(cn);
		add(c);
		add(oopn);
		add(oop);
		add(networkn);
		add(network);
		
		

		// Add action event handlers.
		adbms.addActionListener(this);
		acn.addActionListener(this);
		c.addActionListener(this);
		oop.addActionListener(this);
		network.addActionListener(this);
	

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}



	public void actionPerformed(ActionEvent ae) {
		repaint();
	}



	public void paint(Graphics g) {
		int a1,a2,a3,a4,a5;
		double p,per,sum;
		String str;

		g.drawString("Enter Marks out of 50:",5,50);
											//convert all mark into integer
	     	str=adbms.getText();
             	a1=Integer.parseInt(str);
	
             	str=acn.getText();
             	a2=Integer.parseInt(str);
		
		str=c.getText();
             	a3=Integer.parseInt(str);

		str=oop.getText();
             	a4=Integer.parseInt(str);

		str=network.getText();
             	a5=Integer.parseInt(str);

		sum=a1+a2+a3+a4+a5;							//find sum
		p=sum/250;
		per=p*100;								//find percentage
		
		
		g.drawString("percentage:"+per,10,80);					//print percentage

		if(per<=50.0)
		{									//sad face for percentage <= 50
			g.setColor(Color.yellow);
			g.fillOval(250, 200, 150, 150);
  
        		// Ovals for eyes
       	  		// with black color filled
        		g.setColor(Color.BLACK);
        		g.fillOval(290, 250, 15, 15);
        		g.fillOval(340, 250, 15, 15);
  
        		//g.setColor(c1);						
			g.drawLine(290, 310, 345, 310);
		}
		else									//happy face for percentage >50									
		{	
			g.setColor(Color.yellow);
			g.fillOval(250, 200, 150, 150);
  
  
        		// Ovals for eyes
       	  		// with black color filled
        		g.setColor(Color.BLACK);
        		g.fillOval(290, 250, 15, 15);
        		g.fillOval(340, 250, 15, 15);
        		
			// Arc for the smile
        		g.drawArc(300, 310, 50, 20, 180, 180);
		}
		

	
              
      }


public static void main(String[] args) {
	Smiley appwin = new Smiley();
	appwin.setSize(new Dimension(750,800));
	appwin.setTitle("Marks");
	appwin.setVisible(true);
}
}
Verified
