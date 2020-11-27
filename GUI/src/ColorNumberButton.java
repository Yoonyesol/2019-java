
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Button extends JFrame{
 
 public Button() {
  setTitle("건준컴퓨터학원");
  setSize(700,350);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container c = getContentPane();
  c.setLayout(new GridLayout(1,10));
  
  JButton one = new JButton("1");
  one.setSize(40, 200);
  one.setBackground(Color.black);
  
  JButton two = new JButton("2");
  two.setSize(40, 200);
  two.setBackground(Color.BLUE);
  
  JButton three = new JButton("3");
  three.setSize(40, 200);
  three.setBackground(Color.cyan);
  
  JButton four = new JButton("4");
  four.setSize(40, 200);
  four.setBackground(Color.DARK_GRAY);
  
  JButton five = new JButton("5");
  five.setSize(40, 200);
  five.setBackground(Color.GRAY);
  
  JButton six = new JButton("6");
  six.setSize(40, 200);
  six.setBackground(Color.GREEN);
  
  JButton seven = new JButton("7");
  seven.setSize(40, 200);
  seven.setBackground(Color.MAGENTA);
  
  JButton eight = new JButton("8");
  eight.setSize(40, 200);
  eight.setBackground(Color.ORANGE);
  
  
  JButton nine = new JButton("9");
  nine.setSize(40, 200);
  nine.setBackground(Color.PINK);
  
  
  JButton ten = new JButton("10");
  ten.setSize(40, 200);
  ten.setBackground(Color.YELLOW);
  
  
  c.add(one);
  c.add(two);
  c.add(three);
  c.add(four);
  c.add(five);
  c.add(six);
  c.add(seven);
  c.add(eight);
  c.add(nine);
  c.add(ten);
  
  setVisible(true);
 }
}
public class ColorNumberButton {

 public static void main(String[] args) {
  Button b = new Button();

 }

}
 
