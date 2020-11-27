import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanFrame extends JFrame{
	
	JLabel [] label = new JLabel[10];
	
	public PanFrame() {
		setTitle("여러개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		
		JPanel c = new JPanel();
		JPanel d = new JPanel();
		JPanel e = new JPanel();
		setLayout(new BorderLayout());
		add(c, BorderLayout.NORTH);
		add(d, BorderLayout.CENTER);
		add(e, BorderLayout.SOUTH);
		
		c.setLayout(new FlowLayout());
		c.setSize(500,50);
		JLabel menu = new JLabel ();
		c.setBackground(Color.GRAY);
		JButton open = new JButton("열기");
		JButton close = new JButton("닫기");
		JButton exit = new JButton("나가기");
		c.add(menu);
		c.add(open);
		c.add(close);
		c.add(exit);
  
	
		d.setLayout(null);
		d.setSize(500,200);
		d.setBackground(Color.white);
		for(int i = 0; i<label.length; i++) {
			label[i] = new JLabel("*");
		}
 
		for(int i=0; i<label.length; i++) {
   
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			label[i].setLocation(x,y);
			label[i].setSize(20,20);
			d.add(label[i]);
		}
		
		
		
		e.setLayout(new FlowLayout());
		e.setSize(50,10);
		JLabel result = new JLabel ("Word input");
		JTextField resultField = new JTextField(20);
		e.setBackground(Color.orange);
		e.add(result, BorderLayout.SOUTH);
		e.add(resultField, BorderLayout.SOUTH);
		
		setVisible(true);
		}
	}
public class PanelFrame {

	public static void main(String[] args) {
		PanFrame a = new PanFrame();

	}

}
 
