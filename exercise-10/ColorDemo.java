//1. Program to draw Circle, Rectangle, Line

import java.awt.*;
import java.awt.event.*;
public class ColorDemo extends Frame {
public ColorDemo() {
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}
// 
public void paint(Graphics g) {
Color c1 = new Color(100, 255, 100);
Color c2 = new Color(255, 100, 100);
Color c3 = new Color(100, 100, 255);

g.setColor(c1);
g.drawLine(75,90,100,300);

g.setColor(c2);
g.fillOval(70, 90, 140, 100);

g.setColor(c3);
g.fillRect(400, 40, 60, 300);

}

public static void main(String[] args) {
ColorDemo appwin = new ColorDemo();

appwin.setSize(new Dimension(500, 600));
appwin.setTitle("ColorDemo");
appwin.setVisible(true);
}
}


Verified
