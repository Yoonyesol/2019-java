
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
 
	public JButton rbt;
	public JButton bbt;
	public JButton ybt;
	public JLabel label;
	public JPanel panel;

	private class MyListener implements ActionListener{

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if(e.getSource()==rbt) {
				panel.setBackground(Color.RED);
			} else if(e.getSource()==bbt) {
				panel.setBackground(Color.blue);
			} else if(e.getSource()==ybt) {
				panel.setBackground(Color.yellow);
			}
		}
  
	}
 
	public MyFrame () {
  
		setLayout(new BorderLayout());
  
		panel = new JPanel();
		label = new JLabel("여기 이 라벨에 배경색이 바뀔거에요^^");
		add(panel, BorderLayout.CENTER);
		panel.setSize(100,200);
		panel.add(label);
  
		rbt = new JButton("빨강으로 얍!");
		JPanel rbtpanel = new JPanel();
		add(rbtpanel, BorderLayout.WEST);
		rbtpanel.add(rbt);
		rbtpanel.setSize(10,30);
		rbt.addActionListener(new MyListener());
  
  
		bbt = new JButton("파랑으로 얍!");
		JPanel bbtpanel = new JPanel();
		add(bbtpanel, BorderLayout.SOUTH);
		bbtpanel.add(bbt);
		bbt.setSize(10,30);
		bbt.addActionListener(new MyListener());
  
  
		ybt = new JButton ("노랑으로 얍!");
		JPanel ybtpanel = new JPanel();
		add(ybtpanel, BorderLayout.EAST);
		ybtpanel.add(ybt);
		ybt.setSize(10,30);
		ybt.addActionListener(new MyListener());
  
  
		setTitle ("리스너 구동 연습문제");
		setSize (500,200);
		setResizable(false);
		setVisible(true);
  
	}
 
}

public class BackGroundColor {

 public static void main(String[] args) {
  MyFrame t = new MyFrame();

 }

}
 
