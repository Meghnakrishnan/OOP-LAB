/*2. Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s
choice.*/



import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame
implements ItemListener {
Choice shape;
String msg = "";

public ChoiceDemo() {

	// Use a flow layout.
	setLayout(new FlowLayout());
	// Create choice lists.
	shape = new Choice();

	// Add items to os list.
	shape.add("Rectangle");
	shape.add("Triangle");
	shape.add("Square");
	shape.add("Circle");

	//add choice list to window
        add(shape);
	// Add item listeners.
	shape.addItemListener(this);


	addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent we) {
	System.exit(0);
	}
    });
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g){
	String str=shape.getSelectedItem();
	Color c1 = new Color(255, 100, 100);
	Color c2 = new Color(100, 255, 100);

	if(str.equals("Rectangle")) {
		g.setColor(c2);
		g.fillRect(200, 200, 120, 80);
        }
	else if(str.equals("Triangle")) {
		g.setColor(c1);
		g.drawLine(140, 150, 300, 150);
		g.drawLine(140, 150, 220, 85);
		g.drawLine(220, 85, 300, 150);
        }
	else if(str.equals("Square")){
		g.setColor(c1);
		g.fillRect(200, 200, 120, 120);
       }
	else{
		g.setColor(c2);
		g.fillOval(100, 200, 100, 100);
	}

}



public static void main(String[] args) {
ChoiceDemo appwin = new ChoiceDemo();

appwin.setSize(new Dimension(240, 180));
appwin.setTitle("ChoiceDemo");
appwin.setVisible(true);
}
}
Verified
