import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Texttest extends JFrame {
	public Texttest() {
		setTitle("텍스트 만들어보자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학",20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("경기도,...",20));
		
		setSize(270,150);
		setVisible(true);
	}
}
public class TextFieldEx {

	public static void main(String[] args) {
		Texttest t = new Texttest();

	}

}
