import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener {
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest() {
		panel = new JPanel (new GridLayout(0,20));
		panel.add(new JLabel("문자를 입력"));
		field = new JTextField(10);
		
		panel.add(field);
		area = new JTextArea(3,30);
		add(panel, BorderLayoutExam.NORTH);
		add(area, BorderLayoutExam.CENTER);
		
		field.addKeyListener(this);
		setTitle("키이벤트 테스트");
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEventTest();

	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "키가 입력된겨");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "키가 눌리는 순간이여");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "키에서 손을 뗀겨");
		
	}
	
	protected void display(KeyEvent e, String s) {
		area.append(s+"\n");
	}


}
