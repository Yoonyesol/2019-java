import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Texttest extends JFrame {
	public Texttest() {
		setTitle("�ؽ�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ���",20));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("��⵵,...",20));
		
		setSize(270,150);
		setVisible(true);
	}
}
public class TextFieldEx {

	public static void main(String[] args) {
		Texttest t = new Texttest();

	}

}
