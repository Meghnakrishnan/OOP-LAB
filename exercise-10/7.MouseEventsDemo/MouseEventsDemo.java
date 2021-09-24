/*
7. Develop a program to handle all mouse events and window
events
*/

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame
implements MouseListener, MouseMotionListener {

	String msg = "";
	int mouseX = 0, mouseY = 0; // coordinates of	mouse


      	public MouseEventsDemo() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}





											// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
		msg = msg + " ----CLICK RECIEVED";
		repaint();
	}




											// Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
		mouseX = 100;
		mouseY = 100;
		msg = "MOUSE ENTERED";
		repaint();
	}




											// Handle mouse exited.
	public void mouseExited(MouseEvent me) {
		mouseX = 100;
		mouseY = 100;
		msg = "MOUSE EXITED";
		repaint();
	}




											// Handle button pressed.
	public void mousePressed(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "BUTTON PRESSED";
		repaint();
	}





											// Handle button released.
	public void mouseReleased(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "BUTTON RELEASED";
		repaint();
	}
	





											// Handle mouse dragged.
	public void mouseDragged(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "MOUSE AT " + mouseX + ", " + mouseY+"----------------";
		repaint();

	}






											// Handle mouse moved.
	public void mouseMoved(MouseEvent me) {
		msg = "-------------------MOVING MOUSE AT " + me.getX()+ ", " + me.getY()+"---------------------";
		repaint();
	}





											// Display msg in the window at current X,Y location.
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.drawString(msg, mouseX, mouseY);
	}





	public static void main(String[] args) {
		MouseEventsDemo appwin = new MouseEventsDemo();

		appwin.setSize(new Dimension(500,500));
		appwin.setTitle("MouseEventDemo");
		appwin.setVisible(true);
	}
}




											// When the close box in the frame is clicked,
											// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	} 
}
Verified
