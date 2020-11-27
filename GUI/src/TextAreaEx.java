import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	public TextAreaEx() {
		setTitle("텍스트 영역연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력하고 엔터치시오"));
		c.add(tf);
		c.add(new JScrollPane(ta)); //TextArea에 스크롤패널 추가
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); //TextField가 실행됐는지 찾아서 결과값을 t에 저장
				ta.append(t.getText()+"\n");
				
				t.setText("");
				
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TextAreaEx();

	}

}
