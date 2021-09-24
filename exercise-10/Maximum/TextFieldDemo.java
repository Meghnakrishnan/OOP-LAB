/*
3. Program to find maximum of three numbers using AWT.
*/

import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener{
TextField num1,num2,num3;

public TextFieldDemo(){
//use flow layout
setLayout(new FlowLayout());

//create controls
Label first=new Label("FIRST ");
Label second=new Label("SECOND ");
Label third=new Label("THIRD ");

num1 = new TextField("0");
num2 = new TextField("0");
num3 = new TextField("0");

//add controls to frame
add(num1);
add(first);
add(num2);
add(second);
add(num3);
add(third);

// Add action event handlers.
num1.addActionListener(this);
num2.addActionListener(this);
num3.addActionListener(this);

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
int a,b,c,res;
String str;
g.drawString("Enter value to Check the Maximum of 3 ",10,50);
	     str=num1.getText();
             a=Integer.parseInt(str);
             str=num2.getText();
             b=Integer.parseInt(str);
             str=num3.getText();
             c=Integer.parseInt(str);     
		
	g.setColor(Color.blue);
              if (a>b) {
                  if (a>c)
                      res=a;
                  else
                      res=c;
                }
            else{
                  if (b>c) 
                      res=b;
                  else
                      res=c;
	}
	      g.drawString("Maximnum of 3 numbers is "+res,10,70);
              
            }


public static void main(String[] args) {
TextFieldDemo appwin = new TextFieldDemo();
appwin.setSize(new Dimension(280,180));
appwin.setTitle("TextFieldDemo");
appwin.setVisible(true);
}
}
Verified

