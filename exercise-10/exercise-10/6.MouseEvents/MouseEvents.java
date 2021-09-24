/*
6. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.
*/



import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame
implements MouseListener, MouseMotionListener {

	
	
	Color c1=new Color(51,153,255);							//set c1 as blue
      	public MouseEvents() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}





											// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
		
		c1 = new Color(255,0,0);							//set c1 as red
		repaint();
	}




											// Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
		
		
	}




											// Handle mouse exited.
	public void mouseExited(MouseEvent me) {
		
		
	}




											// Handle button pressed.
	public void mousePressed(MouseEvent me) {
		
	}





											// Handle button released.
	public void mouseReleased(MouseEvent me) {
		
	}
	





											// Handle mouse dragged.
	public void mouseDragged(MouseEvent me) {
		

	}






											// Handle mouse moved.
	public void mouseMoved(MouseEvent me) {
		
	}





											
	public void paint(Graphics g) {
		

			g.drawRect(240, 200, 250, 250);				//make home
	
			g.setColor(c1);						//set c1 as color of door
  			g.fillRect(350, 300, 70, 150);
			
			g.setColor(Color.green);
			g.fillRect(270, 250, 50, 50);			
				
			g.setColor(Color.green);
			int x[]={350,190,540};
			int y[]={80,200,200};
			g.fillPolygon(x,y,3);
	}





	public static void main(String[] args) {
		MouseEvents appwin = new
		MouseEvents();

		appwin.setSize(new Dimension(700,500));
		appwin.setTitle("HOME");
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
