
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Label extends JFrame{
 
	JLabel [] label = new JLabel[20];
 
	public Label() {
		setTitle("건준컴퓨터학원");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
  
		for(int i = 0; i<label.length; i++) {
			label[i] = new JLabel();
		}
 
		for(int i=0; i<label.length; i++) {
   
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
   
			label[i].setLocation(x,y);
			label[i].setSize(10,10);
			label[i].setBackground(Color.GREEN);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
  
		setVisible(true);
		}
	}
public class JLabelEx {

	public static void main(String[] args) {
		Label l = new Label();
	}

}
 
