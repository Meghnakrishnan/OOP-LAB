import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
  TextField t1, t2;
  Button add,sub,mul,div;
  float result;
  public Calculator() {
    setLayout(null);
    Label l1 = new Label("Enter number:",Label.RIGHT);
    Label l2 = new Label("Enter number:", Label.RIGHT);
    t1 = new TextField();
    t2 = new TextField();
    add = new Button("+");
    sub = new Button("-");
    mul = new Button("x");
    div = new Button("/");
    
    l1.setBounds(50,100,100,20);
    l2.setBounds(50,150,100,20);
    t1.setBounds(200,100,100,20);
    t2.setBounds(200,150,100,20);
    add.setBounds(50,250,50,20);
    sub.setBounds(110,250,50,20);
    mul.setBounds(170,250,50,20);
    div.setBounds(230,250,50,20);
    add(l1);
    add(l2);
    add(t1);
    add(t2);
    add(add);
    add(sub);
    add(mul);
    add(div);
    add.addActionListener(this);
    sub.addActionListener(this);
    div.addActionListener(this);
    mul.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    float num1 = Float.parseFloat(t1.getText()); 
    float num2 = Float.parseFloat(t2.getText()); 
    if(e.getSource() == add) {
         result = num1 + num2;
    } else if(e.getSource() == sub) {
         result = num1 - num2;
    } else if(e.getSource() == mul) {
         result = num1 * num2;
    } else if(e.getSource() == div) {
         result = num1 / num2;
    }
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString("Result:"+String.valueOf(result), 200,200);
  }
}

class Calculatorr {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.setSize(new Dimension(450,450));
    calc.setTitle("Calculator");
    calc.setVisible(true);
  }
}