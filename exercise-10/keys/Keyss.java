
//8. Develop a program to handle Key events.

import java.awt.*;
import java.awt.event.*;

public class Keyss extends Frame
implements KeyListener {

	String msg = "";
	String keyState = "";
	


	public Keyss() {
		addKeyListener(this);
		addWindowListener(new MyWindowAdapter());
	}



								// Handle a key press.
	public void keyPressed(KeyEvent ke) {
		keyState = "Key Down";
		repaint();
	}




								// Handle a key release.
	public void keyReleased(KeyEvent ke) {
		keyState = "Key Up";
		repaint();
	}




								// Handle key typed.
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}




								// Display keystrokes.
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString(keyState,250, 100);
		g.setColor(Color.red);
		g.drawString(msg, 20, 200);
	}



	public static void main(String[] args) {
		Keyss appwin = new Keyss();

		appwin.setSize(new Dimension(700,500));
		appwin.setTitle("SimpleKey");
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
