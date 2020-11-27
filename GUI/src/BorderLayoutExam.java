
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class Border extends JFrame{
 Border() {
  setTitle ("건준컴퓨터학원");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(400,200);
  
  Container c = getContentPane();
  c.setLayout(new BorderLayout(7,5));
  
  c.add(new JButton("North"),BorderLayout.NORTH);
  c.add(new JButton("Center"),BorderLayout.CENTER);
  c.add(new JButton("west"),BorderLayout.WEST);
  c.add(new JButton("East"),BorderLayout.EAST);
  c.add(new JButton("South"),BorderLayout.SOUTH);
  
  
  setVisible(true);
 }
}
public class BorderLayoutExam {

 public static void main(String[] args) {
  Border n = new Border();
 }

}
 
